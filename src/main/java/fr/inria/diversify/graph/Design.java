package fr.inria.diversify.graph;

import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.DefaultModalGraphMouse;
import edu.uci.ics.jung.visualization.picking.PickedInfo;
import edu.uci.ics.jung.visualization.picking.PickedState;
import edu.uci.ics.jung.visualization.renderers.Renderer;
import org.apache.commons.collections15.Transformer;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: Simon
 * Date: 4/24/13
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Design {
    public Graph<Node, String> graph;
    public Design(Graph<Node, String> g) {

        this.graph = g;
    }

    private static class VertexPaintTransformer implements Transformer<StatementNode,Paint> {

        private final PickedInfo<StatementNode> pi;

        VertexPaintTransformer ( PickedInfo<StatementNode> pi ) {
            super();
            if (pi == null)
                throw new IllegalArgumentException("PickedInfo instance must be non-null");
            this.pi = pi;
        }

        @Override
        public Paint transform(StatementNode i) {
            Color p = null;
            p =  Color.RED;
            if ( pi.isPicked(i)){
                p = Color.green;
            }
            return p;
        }
    }

    private static class VertexLabelTransformer implements Transformer<StatementNode,String>{
        private final PickedInfo<StatementNode> pi;

        public VertexLabelTransformer( PickedState<StatementNode> pi ){
            this.pi = pi;
        }

        @Override
        public String transform(StatementNode t) {
            if (pi.isPicked(t))
                return t.toString();
            else
                return "";
        }
    }


    @SuppressWarnings("unchecked")
    public void display() {

        Layout<StatementNode, String> layout = new FRLayout(graph);
        layout.setSize(new Dimension(800,800));
        VisualizationViewer<StatementNode, String> vv = new VisualizationViewer<StatementNode, String>(layout);


        vv.setPreferredSize(new Dimension(850,850));
        vv.getRenderContext().setVertexLabelTransformer(new VertexLabelTransformer(vv.getPickedVertexState()));
        vv.getRenderContext().setVertexFillPaintTransformer(new VertexPaintTransformer(vv.getPickedVertexState()));

        DefaultModalGraphMouse graphMouse = new DefaultModalGraphMouse();
        graphMouse.setMode(edu.uci.ics.jung.visualization.control.ModalGraphMouse.Mode.PICKING);
        vv.setGraphMouse(graphMouse);

        vv.getRenderer().getVertexLabelRenderer().setPosition(Renderer.VertexLabel.Position.CNTR);


        JFrame frame = new JFrame("Statements");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }
}
