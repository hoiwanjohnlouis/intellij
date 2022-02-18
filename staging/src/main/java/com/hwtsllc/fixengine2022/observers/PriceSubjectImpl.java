/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.observers;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PriceSubjectImpl implements Subject {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private ArrayList<Observer> observers;

    public PriceSubjectImpl() {
        logger.trace("in PriceSubjectImpl");
        observers = new ArrayList<>();
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
