package com.hwtechservicesllc.staging2016.observers;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class PriceSubjectImpl implements Subject {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private ArrayList<Observer> observers;

    public PriceSubjectImpl() {
        logger.trace("in PriceSubjectImpl");
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        logger.trace("in register");
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        logger.trace("in unregister");

        int observerIndex = observers.indexOf(o);
        if (observerIndex >= 0) {
            logger.info("Observer #" + (observerIndex + 1) + " deleted");
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObserver() {
        // call update method for each Observer
        for (Observer observer : observers) {
            observer.update(0.1, 0.2, 0.3);
        }
    }
}
