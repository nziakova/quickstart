package org.jboss.as.quickstarts.ha.singleton.service.primary;

import org.jboss.logging.Logger;
import org.wildfly.clustering.singleton.SingletonElectionListener;
import org.wildfly.clustering.group.Node;

import java.util.List;

public class MySingletonElectionListener implements SingletonElectionListener {

    private final Logger LOG = Logger.getLogger(MySingletonElectionListener.class);

    @Override
    public void elected(List<Node> candidates, Node primary) {
        LOG.info("Elected node: " + primary.getName());
    }
}
