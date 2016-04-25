package com.hwtechservicesllc.staging2016.observers;

import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class PriceSubjectImpl implements ISubject {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private ArrayList<IObserver> observers;

    public PriceSubjectImpl() {
        logger.trace("in PriceSubjectImpl");
        observers = new ArrayList<IObserver>();
    }

    @Override
    public void register(IObserver o) {
        logger.trace("in register");
        observers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        logger.trace("in unregister");

        int observerIndex = observers.indexOf(o);
        if (observerIndex >= 0) {
            logger.info("Observer #" + (observerIndex + 1) + " deleted");
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObserver() {
        // call update method for each IObserver
        for (IObserver observer : observers) {
            observer.update(0.1, 0.2, 0.3);
        }
    }
}
