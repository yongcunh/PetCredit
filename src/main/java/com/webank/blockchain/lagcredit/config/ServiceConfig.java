package com.webank.blockchain.lagcredit.config;

import lombok.Data;
import org.fisco.bcos.channel.client.Service;
import org.fisco.bcos.channel.handler.GroupChannelConnectionsConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webank.blockchain.lagcredit.constants.ConnectConstants;

@Data
@Configuration
@ConfigurationProperties(prefix = "channel-service")
public class ServiceConfig {

    private String orgID;
    private static int groupId = 1;

    @Bean
    public Service getService(GroupChannelConnectionsConfig groupChannelConnectionsConfig) {
        Service channelService = new Service();
        channelService.setConnectSeconds(ConnectConstants.CONNECT_SECONDS);
        channelService.setOrgID(orgID);
        channelService.setConnectSleepPerMillis(ConnectConstants.CONNECT_SLEEP_PER_MILLIS);
        channelService.setGroupId(groupId);
        channelService.setAllChannelConnections(groupChannelConnectionsConfig);
        return channelService;
    }
}
