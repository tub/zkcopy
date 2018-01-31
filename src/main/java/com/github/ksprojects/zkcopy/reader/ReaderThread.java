package com.github.ksprojects.zkcopy.reader;

import java.io.IOException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

final class ReaderThread extends Thread implements Watcher {

    private ZooKeeper zk = null;

    ReaderThread(Runnable r, String hostPort) {
        super(r);
        try {
            zk = new ZooKeeper(hostPort, 40000, this);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void process(WatchedEvent event) {
        // TODO Auto-generated method stub

    }

    public ZooKeeper getZooKeeper() {
        return zk;
    }

}
