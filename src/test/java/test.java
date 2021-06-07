
import gofs.FS;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class test {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Configuration conf = new Configuration();
        conf.set("dfs.client.use.datanode.hostname", "true");
        URI uri = new URI("hdfs://hadoopmaster:58494");
        FS fs = new FS(uri ,conf);
        FileSystem hdfs = fs.getHDFS();
        String condition =  "";
        String path="/Users/bytedance/Desktop/test/"+condition.substring(4);
        hdfs.copyFromLocalFile(new Path(path),new Path("/1.txt"));
    }
}
