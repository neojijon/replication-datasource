package kr.pe.kwonnam.replicationdatasource;

import kr.pe.kwonnam.replicationdatasource.config.WithRoutingDataSourceConfig;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

/**
 * Replication with {@link kr.pe.kwonnam.replicationdatasource.routingdatasource.ReplicationRoutingDataSource}.
 */
@ContextConfiguration(classes = {WithRoutingDataSourceConfig.class})
@DirtiesContext
public class ReplicationRoutingDataSourceIntegrationTest extends AbstractReplicationDataSourceIntegrationTest {
}
