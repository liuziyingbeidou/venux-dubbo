1.Dubbo
Apache Dubbo™（孵化）是一种基于Java的高性能开源RPC框架;是一个分布式服务框架，致力于提供高性能和透明化的RPC远程服务调用方案，以及SOA服务治理方案。

由于dubbo各个分层都是很多扩展，比如注册中心有redis、zookeeper选项，通信模块有netty、mina，序列化有hession、hession2、java序列化等，本文不能面面俱到，重点阐述主线流程，注册中心选择zookeeper(client选择curator)，通信选择netty，协议选择dubbo，序列化选择hession2,容器选择Spring。

