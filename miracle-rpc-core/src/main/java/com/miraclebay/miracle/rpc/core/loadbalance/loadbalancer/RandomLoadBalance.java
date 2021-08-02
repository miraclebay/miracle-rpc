package com.miraclebay.miracle.rpc.core.loadbalance.loadbalancer;

import com.miraclebay.miracle.rpc.core.loadbalance.AbstractLoadBalance;
import com.miraclebay.miracle.rpc.core.remoting.dto.RpcRequest;

import java.util.List;
import java.util.Random;

public class RandomLoadBalance extends AbstractLoadBalance {
    @Override
    protected String doSelect(List<String> serviceAddresses, RpcRequest rpcRequest) {
        Random random = new Random();
        return serviceAddresses.get(random.nextInt(serviceAddresses.size()));
    }
}