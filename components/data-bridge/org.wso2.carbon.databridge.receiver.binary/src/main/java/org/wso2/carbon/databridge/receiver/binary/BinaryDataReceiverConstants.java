/*
*  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.databridge.receiver.binary;

public class BinaryDataReceiverConstants {
    public static final int DEFAULT_SSL_RECEIVER_THREAD_POOL_SIZE = 100;
    public static final int DEFAULT_TCP_RECEIVER_THREAD_POOL_SIZE = 100;
    public static final int DEFAULT_SSL_RECEIVER_PORT = 9611;
    public static final int DEFAULT_TCP_RECEIVER_PORT = 9711;
    public static final String DATA_BRIDGE_RECEIVER_CONFIG_NAME = "Binary";

    public static final String SSL_RECEIVER_PORT_CONFIG_NAME = "sslPort";
    public static final String TCP_RECEIVER_PORT_CONFIG_NAME = "tcpPort";
    public static final String SSL_RECEIVER_THREAD_POOL_SIZE = "sslReceiverThreadPoolSize";
    public static final String TCP_RECEIVER_THREAD_POOL_SIZE = "tcpReceiverThreadPoolSize";

    public static final String CARBON_CONFIG_PORT_OFFSET_NODE = "Ports.Offset";
}
