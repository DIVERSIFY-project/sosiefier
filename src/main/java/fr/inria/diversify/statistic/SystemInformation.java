package fr.inria.diversify.statistic;

import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by Simon on 27/08/14.
 */
public class SystemInformation {
    private static Sigar sigar;


    public SystemInformation() {
        try {
            sigar = new Sigar();
        } catch (Exception e) {}
    }

    public JSONObject toJson() throws JSONException {
        JSONObject object = new JSONObject();
        object.put("os.name", System.getProperty("os.name"));
        object.put("os.version", System.getProperty("os.version"));
        object.put("os.arch", System.getProperty("os.arch"));

        try {
            JSONArray cpus = new JSONArray();
            object.put("cpu", cpus);
            for(CpuInfo cpuInfo: sigar.getCpuInfoList()) {
                JSONObject cpu = new JSONObject();
                cpus.put(cpu);

                cpu.put("model", cpuInfo.getModel());
                cpu.put("vendor", cpuInfo.getVendor());
                cpu.put("core", cpuInfo.getTotalCores());
                cpu.put("mhz", cpuInfo.getMhz());
            }
            object.put("memory", (sigar.getMem().getTotal() / 1024 / 1024));
        } catch (SigarException e) {
        }
        return object;
    }

    public String toString() {
        String ret = "os.name: " + System.getProperty("os.name") + "\n"
               + "os.version: " + System.getProperty("os.version") + "\n"
               + "os.arch: " + System.getProperty("os.arch") + "\n";
        try {
            ret += "total men:" + (sigar.getMem().getTotal() / 1024 / 1024);

            int i = 0;
            for(CpuInfo cpuInfo: sigar.getCpuInfoList()) {
                ret +=  "\ncpu " + i +":\n"
                    + "\tmodel: "+ cpuInfo.getModel() + "\n"
                    + "\tvendor: "+ cpuInfo.getVendor() + "\n"
                    + "\tnf of core: " + cpuInfo.getTotalCores() + "\n"
                    + "\tMhz:" + cpuInfo.getMhz();
                 i++;
            }
        } catch (SigarException e) {
            e.printStackTrace();
        }
        return ret;
    }

    protected List<CpuInfo> getCpuInfo() throws SigarException {
        List<CpuInfo> infos = new ArrayList<>();
        Set<String> models = new HashSet<>();
        for(CpuInfo cpuInfo: sigar.getCpuInfoList()) {
            if(!models.contains(cpuInfo.getModel())) {
                models.add(cpuInfo.getModel());
                infos.add(cpuInfo);
            }
        }

        return infos;
    }
 }
