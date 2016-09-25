package test;

import test.version.VersionInfo;
import mkz.util.io.IO;

public class Test
{
    
    public static void main(String[] args)
    {
        IO.dbOutD("Project Name: "+VersionInfo.getDisplayName());
        IO.dbOutD("Full version: "+VersionInfo.getVersion());
        IO.dbOutD("Timestamp: "+VersionInfo.getBuildTimestamp());
        IO.dbOutD("Build ID: "+VersionInfo.getBuildUID());
    }
}