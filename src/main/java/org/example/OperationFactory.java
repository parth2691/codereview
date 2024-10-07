package org.example;

import org.example.ops.Operations;

import java.util.HashMap;
import java.util.Map;

public class OperationFactory {

    private static OperationFactory instance;
    Map<String, Operations> operationsMap;

    private OperationFactory() {
        operationsMap = new HashMap<>();
    }
    public static synchronized OperationFactory getInstance() {
        if(instance==null) {
            instance = new OperationFactory();
        }
        return instance;
    }

    // Factory method to register operations
    public void registerOperation(String symbol, Operations operation) {
        operationsMap.put(symbol, operation);
    }

    public Operations getOperation(String symbol) {
        Operations op = operationsMap.get(symbol);
        if(op == null) {
            throw new IllegalArgumentException("Operator ="+symbol+" not supported");
        }
        return op;
    }

}
