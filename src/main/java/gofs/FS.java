package gofs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import java.net.URI;

public class FS  {
    private FileSystem hdfs  = null;
    private URI uri = null;
    private Configuration configuration = null;
    public FS(){

    }
    public FS(URI uri, Configuration configuration){
        this.uri = uri;
        this.configuration = configuration;
    }

    public FileSystem getHDFS(){
        try {
            hdfs = FileSystem.get(uri,configuration);
        }catch (Exception e){
            e.printStackTrace();
        }
        return hdfs;
    }

}
