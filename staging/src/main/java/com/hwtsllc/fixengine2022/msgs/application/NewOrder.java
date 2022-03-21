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

package com.hwtsllc.fixengine2022.msgs.application;

import com.hwtsllc.fixengine2022.fix27.tags.Tag60TransactTime;
import com.hwtsllc.fixengine2022.fix40.OpeningPrice;
import com.hwtsllc.fixengine2022.fix40.tags.Tag140PrevClosePx;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class NewOrder implements Comparable {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final OpeningPrice openingPrice;
    private final Tag140PrevClosePx tag140PrevClosePx;
    private final Tag60TransactTime tag60TransactTime;

    //
    private NewOrder(Builder builder) {
        this.openingPrice = builder.openingPrice;
        this.tag140PrevClosePx = builder.tag140PrevClosePx;
        this.tag60TransactTime = builder.tag60TransactTime;
    }

    public OpeningPrice getOpeningPrice() {
        return openingPrice;
    }
    public Tag140PrevClosePx getPreviousDaysClosingPrice() {
        return tag140PrevClosePx;
    }
    public Tag60TransactTime getLastTradeTimeStamp() {
        return tag60TransactTime;
    }

    // If any EnemyShip object is printed to screen this shows up
    @Override
    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder.append(openingPrice.getPrice());
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }

    public int compareTo(Object o) {
        return 0;
    }

    // static builder helper class 
    public static class Builder {

        private final String DEBUG_TAG = this.getClass().getSimpleName();
        private final Logger logger = LogManager.getLogger(DEBUG_TAG);

        private StringBuilder stringBuilder = new StringBuilder();

        private OpeningPrice openingPrice;              // 3
        private Tag140PrevClosePx tag140PrevClosePx;    // 4
        private Tag60TransactTime tag60TransactTime;  // 8

        // helper class to build object
        public Builder buildOpeningPrice(double openingPrice) {
            this.openingPrice = new OpeningPrice(openingPrice);
            return this;
        }
        public Builder buildPreviousDaysClosingPrice(double previousDaysClosingPrice) {
            this.tag140PrevClosePx = new Tag140PrevClosePx(Tag140PrevClosePx.TESTA_PREV_CLOSE_PX);
            return this;
        }
        public Builder buildLastTradeTimeStamp(String lastTradeTimeStamp) {
            this.tag60TransactTime = new Tag60TransactTime(lastTradeTimeStamp);
            return this;
        }

        /**
         *
         * @return          a NewOrder object.
         */
        public NewOrder build() {
            return new NewOrder(this);
        }
    }

    /**
     *
     * @param args Not used
     */
    public static void main(String[] args) {
        logger.trace("New Order");
    }

}
