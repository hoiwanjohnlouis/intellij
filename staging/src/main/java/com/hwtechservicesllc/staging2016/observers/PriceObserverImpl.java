package com.hwtechservicesllc.staging2016.observers;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 **/

public class PriceObserverImpl implements IObserver {

    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private ISubject priceUpdate;

    public PriceObserverImpl(ISubject priceUpdate) {
        this.priceUpdate = priceUpdate;
        this.priceUpdate.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {

    }

}
