package com.hwtechservicesllc.staging2016.observers;

import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Package com.hwtechservicesllc.stocks2016.fields
 * Project intellijPrototyping
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

public class PriceSubjectImpl implements ISubject {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final Logger logger = Logger.getLogger(DEBUG_TAG);

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
