/*
 *  Copyright WSO2 Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.wso2.carbon.apimgt.securityenforcer.dto;

import org.apache.http.HttpHeaders;

import java.util.Set;

/**
 * This class contains the config data for AI Security Handlerp .
 *
 */

public class AISecurityHandlerConfig {

    private String mode = "async";
    private int cacheExpiryTime = 15;
    private boolean removeOAuthHeaderFromTransportHeadersEnabled = true;
    private String authorizationHeader = HttpHeaders.AUTHORIZATION;
    private AISecurityHandlerConfig.AseConfig aseConfig;
    private AISecurityHandlerConfig.DataPublisherConfig dataPublisherConfig;
    private AISecurityHandlerConfig.ProxyConfig proxyConfig;
    private AISecurityHandlerConfig.StackObjectPoolConfig stackObjectPoolConfig;
    private AISecurityHandlerConfig.ThreadPoolExecutorConfig threadPoolExecutorConfig;
    private AISecurityHandlerConfig.LimitTransportHeaders limitTransportHeaders;
    private AISecurityHandlerConfig.APIDiscovery apiDiscoveryConfig;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getCacheExpiryTime() {
        return cacheExpiryTime;
    }

    public void setCacheExpiryTime(int cacheExpiryTime) {
        this.cacheExpiryTime = cacheExpiryTime;
    }

    public boolean isRemoveOAuthHeaderFromTransportHeadersEnabled() {
        return removeOAuthHeaderFromTransportHeadersEnabled;
    }

    public void setRemoveOAuthHeaderFromTransportHeadersEnabled(boolean removeOAuthHeaderFromTransportHeadersEnabled) {
        this.removeOAuthHeaderFromTransportHeadersEnabled = removeOAuthHeaderFromTransportHeadersEnabled;
    }

    public String getAuthorizationHeader() {
        return authorizationHeader;
    }

    public void setAuthorizationHeader(String authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
    }

    public AISecurityHandlerConfig.AseConfig getAseConfig() {
        return aseConfig;
    }

    public void setAseConfig(AISecurityHandlerConfig.AseConfig aseConfig) {
        this.aseConfig = aseConfig;
    }

    public DataPublisherConfig getDataPublisherConfig() {
        return dataPublisherConfig;
    }

    public void setDataPublisherConfig(DataPublisherConfig dataPublisherConfig) {
        this.dataPublisherConfig = dataPublisherConfig;
    }

    public ThreadPoolExecutorConfig getThreadPoolExecutorConfig() {
        return threadPoolExecutorConfig;
    }

    public void setThreadPoolExecutorConfig(ThreadPoolExecutorConfig threadPoolExecutorConfig) {
        this.threadPoolExecutorConfig = threadPoolExecutorConfig;
    }

    public StackObjectPoolConfig getStackObjectPoolConfig() {
        return stackObjectPoolConfig;
    }

    public void setStackObjectPoolConfig(StackObjectPoolConfig stackObjectPoolConfig) {
        this.stackObjectPoolConfig = stackObjectPoolConfig;
    }

    public ProxyConfig getProxyConfig() {
        return proxyConfig;
    }

    public void setProxyConfig(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
    }

    public LimitTransportHeaders getLimitTransportHeaders() {
        return limitTransportHeaders;
    }

    public void setLimitTransportHeaders(LimitTransportHeaders limitTransportHeaders) {
        this.limitTransportHeaders = limitTransportHeaders;
    }

    public APIDiscovery getApiDiscoveryConfig() {
        return apiDiscoveryConfig;
    }

    public void setApiDiscoveryConfig(APIDiscovery apiDiscoveryConfig) {
        this.apiDiscoveryConfig = apiDiscoveryConfig;
    }

    public static class AseConfig {

        private String endPoint;
        private String aseToken;

        public String getEndPoint() {
            return endPoint;
        }

        public void setEndPoint(String endPoint) {
            this.endPoint = endPoint;
        }

        public String getAseToken() {
            return aseToken;
        }

        public void setAseToken(String aseToken) {
            this.aseToken = aseToken;
        }
    }

    public static class DataPublisherConfig {

        private Integer maxOpenConnections = 500;
        private Integer maxPerRoute = 200;
        private Integer connectionTimeout = 30;

        public Integer getMaxOpenConnections() {
            return maxOpenConnections;
        }

        public void setMaxOpenConnections(Integer maxOpenConnections) {
            this.maxOpenConnections = maxOpenConnections;
        }

        public Integer getMaxPerRoute() {
            return maxPerRoute;
        }

        public void setMaxPerRoute(Integer maxPerRoute) {
            this.maxPerRoute = maxPerRoute;
        }

        public Integer getConnectionTimeout() {
            return connectionTimeout;
        }

        public void setConnectionTimeout(Integer connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
        }
    }

    public static class ProxyConfig {

        private Boolean proxyEnabled = false;
        private String hostname;
        private Integer port;
        private String userName;
        private String password;

        public Boolean isProxyEnabled() {
            return proxyEnabled;
        }

        public void setProxyEnabled(Boolean proxyEnabled) {
            this.proxyEnabled = proxyEnabled;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class StackObjectPoolConfig {

        private Integer maxIdle = 1000;
        private Integer initIdleCapacity = 200;

        public Integer getMaxIdle() {
            return maxIdle;
        }

        public void setMaxIdle(Integer maxIdle) {
            this.maxIdle = maxIdle;
        }

        public Integer getInitIdleCapacity() {
            return initIdleCapacity;
        }

        public void setInitIdleCapacity(Integer initIdleCapacity) {
            this.initIdleCapacity = initIdleCapacity;
        }
    }

    public static class ThreadPoolExecutorConfig {

        private Integer corePoolSize = 200;
        private Integer maximumPoolSize = 500;
        private Long keepAliveTime = 100L;

        public Integer getCorePoolSize() {
            return corePoolSize;
        }

        public void setCorePoolSize(Integer corePoolSize) {
            this.corePoolSize = corePoolSize;
        }

        public Integer getMaximumPoolSize() {
            return maximumPoolSize;
        }

        public void setMaximumPoolSize(Integer maximumPoolSize) {
            this.maximumPoolSize = maximumPoolSize;
        }

        public Long getKeepAliveTime() {
            return keepAliveTime;
        }

        public void setKeepAliveTime(Long keepAliveTime) {
            this.keepAliveTime = keepAliveTime;
        }
    }

    public static class LimitTransportHeaders {

        private boolean enable = false;
        private Set<String> headerSet;

        public boolean isEnable() {
            return enable;
        }

        public void setEnable(boolean enable) {
            this.enable = enable;
        }

        public Set<String> getHeaderSet() {
            return headerSet;
        }

        public void setHeaderSet(Set<String> headerSet) {
            this.headerSet = headerSet;
        }
    }

    public static class APIDiscovery {

        private boolean enable = false;
        private String managementAPIEndpoint;
        private String accessKey;
        private String secretKey;

        public boolean isEnable() {
            return enable;
        }

        public void setEnable(boolean enable) {
            this.enable = enable;
        }

        public String getManagementAPIEndpoint() {
            return managementAPIEndpoint;
        }

        public void setManagementAPIEndpoint(String managementAPIEndpoint) {
            this.managementAPIEndpoint = managementAPIEndpoint;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
    }

}