package fr.inria.diversify.logger.graph;

import fr.inria.diversify.util.Log;
import spoon.reflect.code.*;
import spoon.reflect.declaration.*;
import spoon.reflect.reference.*;
import spoon.reflect.visitor.CtScanner;

import java.util.*;

/**
 * User: Simon
 * Date: 19/05/15
 * Time: 16:14
 */
@Deprecated
public class BuildGraph extends CtScanner {
    Map<Object, Node> nodes;
    List<Edge> edges;

    public BuildGraph() {
        nodes = new IdentityHashMap<>();
        edges = new ArrayList<>();
    }

    public Graph getGraph(String name) {
        return new Graph(name, nodes.values(), edges);
    }

    public <T, E extends CtExpression<?>> void visitCtArrayAccess(CtArrayAccess<T, E> arrayAccess) {
        Log.debug("visitCtArrayAccess " + arrayAccess.toString());
        super.visitCtArrayAccess(arrayAccess);

        Node node = new Node(TypeNode.arrayAccess, arrayAccess);
        nodes.put(arrayAccess, node);

        Edge edge = new Edge(getNode(arrayAccess.getIndexExpression()), node, "arg0");
        edges.add(edge);
    }


    public <T, A extends T> void visitCtAssignment(CtAssignment<T, A> assignement) {
        Log.debug("visitCtAssignment " + assignement.toString());
        super.visitCtAssignment(assignement);

        Edge edge = new Edge(getNode(assignement.getAssignment()), getNode(assignement.getAssigned()), "assignement");
        edges.add(edge);
    }

    public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
        Log.debug("visitCtBinaryOperator " + operator.toString());
         super.visitCtBinaryOperator(operator);

        Node operatorNode = new Node(TypeNode.methodCall, operator);
        nodes.put(operator, operatorNode);

        Edge left = new Edge(getNode(operator.getLeftHandOperand()), operatorNode, "arg0");
        Edge right = new Edge(getNode(operator.getRightHandOperand()), operatorNode, "arg1");

        edges.add(left);
        edges.add(right);
    }

    public <S> void visitCtCase(CtCase<S> caseStatement) {
        Log.debug("visitCtCase "+caseStatement.toString());
         super.visitCtCase(caseStatement);
    }

    public <T> void visitCtConditional(CtConditional<T> conditional) {
        Log.debug("visitCtConditional " + conditional.toString());
         super.visitCtConditional(conditional);
        Node cond = new Node(TypeNode.conditinal, conditional);
        nodes.put(conditional, cond);

        Edge condition = new Edge(getNode(conditional.getCondition()), cond, "condition");
        Edge thenEdge = new Edge(getNode(conditional.getThenExpression()), cond, "then");
        Edge elseEdge = new Edge(getNode(conditional.getElseExpression()), cond, "else");
        edges.add(condition);
        edges.add(thenEdge);
        edges.add(elseEdge);
    }

    public void visitCtCatch(CtCatch catchBlock) {
        Log.debug("visitCtCatch "+catchBlock.toString());
         super.visitCtCatch(catchBlock);
    }

    public void visitCtDo(CtDo doLoop) {
        Log.debug("visitCtDo "+doLoop.toString());
         super.visitCtDo(doLoop);
    }

//    public <T> void visitCtTargetedAccess(CtTargetedAccess<T> targetedAccess) {
//        Log.debug("visitCtTargetedAccess "+targetedAccess.toString());
//         super.visitCtTargetedAccess(targetedAccess);
//
//        CtExpression<?> target = targetedAccess.getTarget();
//        Node node = new Node(TypeNode.methodCall, target);
//        nodes.put(targetedAccess, node);
//
//        Edge edge = new Edge(node, getNode(targetedAccess.getVariable()), "receiver");
//        edges.add(edge);
//
//    }

//    public <T> void visitCtThisAccess(CtThisAccess<T> thisAccess) {
//        Log.debug("visitCtThisAccess " + thisAccess.toString());
//
//        if(!nodes.containsKey(thisAccess)) {
//            nodes.put(thisAccess, new Node("this", thisAccess));
//        }
//        super.visitCtThisAccess(thisAccess);
//    }

    public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
        Log.debug("visitCtFieldReference "+reference.toString());


        if(!nodes.containsKey(reference.getDeclaration())) {
            Node node;

            if (!reference.getSimpleName().equals("super")) {
                node = new Node(TypeNode.superReceveiver, reference.getType());
                nodes.put(reference, node);
            }
        }
        super.visitCtFieldReference(reference);
    }

    public void visitCtFor(CtFor forLoop) {
        Log.debug("visitCtFor "+forLoop.toString());
         super.visitCtFor(forLoop);
    }

    public void visitCtForEach(CtForEach foreach) {
        Log.debug("visitCtForEach "+foreach.toString());
         super.visitCtForEach(foreach);
    }

    public void visitCtIf(CtIf ifElement) {
        Log.debug("visitCtIf "+ifElement.toString());
         super.visitCtIf(ifElement);
    }

    public <T> void visitCtInvocation(CtInvocation<T> invocation) {
        super.visitCtInvocation(invocation);
        Log.debug("visitCtInvocation " + invocation.toString());

        CtExecutableReference<T> method = invocation.getExecutable();
        Node node = new Node(TypeNode.methodCall, method);
        nodes.put(invocation, node);

        CtExpression<?> target = invocation.getTarget();

        if(!isStatic(method)) {
            Node targetNode = getNode(target);
            edges.add(new Edge(targetNode, node, "receiver"));
        }

        int i = 0;
        for(CtExpression arg : invocation.getArguments()) {
            edges.add(new Edge(getNode(arg), node, "arg"+i));
        }


    }

    protected boolean isStatic(CtExecutableReference method) {
//        if(method.getDeclaration() != null) {
//            return method.getDeclaration().getModifiers().contains(ModifierKind.STATIC);
//        }
        return false;
    }


    public <T> void visitCtLiteral(CtLiteral<T> literal) {
        Log.debug("visitCtLiteral "+literal.toString());
        Node literalNode;
        if(literal.getType() == null) {
            literalNode = new Node(TypeNode.localVar,"null");
        } else {
            literalNode = new Node(TypeNode.localVar,literal.getType().toString());
        }

        nodes.put(literal, literalNode);

        super.visitCtLiteral(literal);
    }

    public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
        Log.debug("visitCtLocalVariable " + localVariable.toString());
        super.visitCtLocalVariable(localVariable);

        Node localVar = new Node(TypeNode.localVar,localVariable.getType().toString());
        nodes.put(localVariable, localVar);
        Edge edge = new Edge(getNode(localVariable.getDefaultExpression()), localVar, "assignement");
        edges.add(edge);
    }


    public <T> void visitCtNewArray(CtNewArray<T> newArray) {
        Log.debug("visitCtNewArray " + newArray.toString());
         super.visitCtNewArray(newArray);

        Node array = new Node(TypeNode.array, newArray);
//        for(CtExpression )

        nodes.put(newArray,array);
    }

    public <T> void visitCtNewClass(CtNewClass<T> newClass) {
        Log.debug("visitCtNewClass " + newClass.toString());
         super.visitCtNewClass(newClass);

        Node node = new Node(TypeNode.newClass, newClass);
        nodes.put(newClass, node);

        int i = 0;
        for(CtExpression arg : newClass.getArguments()) {
            edges.add(new Edge(getNode(arg), node, "arg"+i));
        }
    }

//    public <T, A extends T> void visitCtOperatorAssignement(CtOperatorAssignment<T, A> assignment) {
//        Log.debug("visitCtOperatorAssignement "+assignment.toString());
//         super.visitCtOperatorAssignement(assignment);
//    }


    public <T> void visitCtParameter(CtParameter<T> parameter) {
        Log.debug("visitCtParameter "+parameter.toString());
        super.visitCtParameter(parameter);
        Node parameterNode = new Node(TypeNode.param,parameter.getType().toString());
        nodes.put(parameter, parameterNode);
    }

//    public <T> void visitCtParameterReference(CtParameterReference<T> reference) {
//        Log.debug("visitCtParameterReference "+reference.toString());
//
//        if(!nodes.containsKey(reference.getDeclaration())) {
//            nodes.put(reference.getDeclaration(), new Node(TypeNode.param,reference.getDeclaration()));
//        }
//
//         super.visitCtParameterReference(reference);
//    }

//    public <R> void visitCtReturn(CtReturn<R> returnStatement) {
//        Log.debug("visitCtReturn "+returnStatement.toString());
//         super.visitCtReturn(returnStatement);
//    }

    public <R> void visitCtStatementList(CtStatementList statements) {
        Log.debug("visitCtStatementList "+statements.toString());
         super.visitCtStatementList(statements);
    }

    public <S> void visitCtSwitch(CtSwitch<S> switchStatement) {
        Log.debug("visitCtSwitch "+switchStatement.toString());
         super.visitCtSwitch(switchStatement);
    }

    public void visitCtSynchronized(CtSynchronized synchro) {
        Log.debug("visitCtSynchronized "+synchro.toString());
         super.visitCtSynchronized(synchro);
    }

    public void visitCtThrow(CtThrow throwStatement) {
        Log.debug("visitCtThrow "+throwStatement.toString());
         super.visitCtThrow(throwStatement);
    }

    public void visitCtTry(CtTry tryBlock) {
        Log.debug("visitCtTry "+tryBlock.toString());
         super.visitCtTry(tryBlock);
    }

    public <T> void visitCtUnaryOperator(CtUnaryOperator<T> operator) {
        Log.debug("visitCtUnaryOperator " + operator.toString());
         super.visitCtUnaryOperator(operator);

        Node node = new Node(TypeNode.methodCall, operator);
        nodes.put(operator, node);
        Edge edge = new Edge(getNode(operator.getOperand()), node, "receiver");
        edges.add(edge);
    }

    public <T> void visitCtVariableAccess(CtVariableAccess<T> variableAccess) {
        Log.debug("visitCtVariableAccess " + variableAccess.toString());

        Object key = null;
        String name = variableAccess.getSignature();
        for(Object node : nodes.keySet()) {
            if(node instanceof CtVariable) {
                CtVariable var = (CtVariable) node;
                if (var.getSignature().equals(name)
                        || (variableAccess.getVariable().getDeclaration() != null
                            && variableAccess.getVariable().getDeclaration().equals(node))) {

                    key = node;
                    break;
                }
            }
        }
        nodes.put(variableAccess, nodes.get(key));

        super.visitCtVariableAccess(variableAccess);
    }

    public void visitCtWhile(CtWhile whileLoop) {
        Log.debug("visitCtWhile " + whileLoop.toString());
         super.visitCtWhile(whileLoop);
    }

    private Node getNode(Object target) {
        if (target == null
                || target.toString().equals("this")
                || target.toString().endsWith(".this")
                || target.toString().equals("super")) {
            return getThisNode();
        } else {
            for(Object node : nodes.keySet()) {
                try {
                    if (node.equals(target)) {
                        return nodes.get(node);
                    }
                } catch (Exception e) {
                   if(node.toString().equals(target.toString())) {
                       return nodes.get(node);
                   }
                }
            }
            return null;
        }
    }

    public <T> void visitCtConstructor(CtConstructor<T> c) {
    }


    protected Node thisNode;
    protected Node getThisNode() {
        if(thisNode == null) {
            thisNode = new Node(TypeNode.field, "this");
            nodes.put("this", thisNode);
        }
        return thisNode;
    }
}
