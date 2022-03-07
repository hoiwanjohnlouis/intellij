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

package com.hwtsllc.fixengine2022.factories;

import com.hwtsllc.fixengine2022.fix40.*;
import com.hwtsllc.fixengine2022.fix40.Tag35MsgType;
import com.hwtsllc.fixengine2022.fix40.Tag140PrevClosePx;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FIXBody implements LogStringVerbose {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    // private static final Logger logger = LogManager.getRootLogger();
    private static final Logger logger = LogManager.getLogger(FIXBody.class);

    private final OpeningPrice openingPrice;
    private final Tag140PrevClosePx tag140PrevClosePx;
    private final Tag31LastPx tag31LastPx;
    private final Tag32LastQty tag32LastQty;
    private final Tag60TransactTime tag60TransactTime;

    //
    private FIXBody(FIXBody.Builder builder) {
        this.openingPrice = builder.openingPrice;
        this.tag140PrevClosePx = builder.tag140PrevClosePx;
        this.tag31LastPx = builder.tag31LastPx;
        this.tag32LastQty = builder.tag32LastQty;
        this.tag60TransactTime = builder.tag60TransactTime;
    }

    public OpeningPrice getOpeningPrice() {
        return openingPrice;
    }
    public Tag140PrevClosePx getPreviousDaysClosingPrice() {
        return tag140PrevClosePx;
    }
    public Tag31LastPx getLastTradePrice() {
        return tag31LastPx;
    }
    public Tag32LastQty getTag32LastQty() {
        return tag32LastQty;
    }
    public Tag60TransactTime getLastTradeTimeStamp() {
        return tag60TransactTime;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder
            .append(openingPrice.getPrice())
            .append("\n")
            .append(tag140PrevClosePx.getTag140PrevClosePxValue())
            .append("\n")
            .append(tag31LastPx.getTag31LastPxValue())
            .append("\n")
            .append(tag32LastQty.getTag32LastQtyValue())
            .append("\n")
            .append(tag60TransactTime.getTimeStamp());

        return stringBuilder.toString();
    }
    @Override
    public String toLogStringVerbose() {
        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder
            .append(openingPrice)
            .append("\n\t")
            .append(tag140PrevClosePx)
            .append("\n\t")
            .append(tag31LastPx)
            .append("\n\t")
            .append(tag32LastQty)
            .append("\n\t")
            .append(tag60TransactTime);

        return stringBuilder.toString();
    }

    public int compareTo(Object o) {
        return 0;
    }

    // static builder helper class
    public static class Builder {
        private StringBuilder stringBuilder = new StringBuilder();

        private Tag53Quantity tag53Shares;
        private Tag54Side tag54Side;
        private OpeningPrice openingPrice;              // 3
        private Tag140PrevClosePx tag140PrevClosePx;    // 4
        private Tag31LastPx tag31LastPx;          // 5
        private Tag32LastQty tag32LastQty;    // 6
        private Tag60TransactTime tag60TransactTime;  // 8

        // helper class to build object
        public Builder() {
        }

        public Builder buildOpeningPrice(double openingPrice) {
            this.openingPrice = new OpeningPrice(openingPrice);
            return this;
        }

        public Builder buildPreviousDaysClosingPrice(double previousDaysClosingPrice) {
            this.tag140PrevClosePx = new Tag140PrevClosePx(previousDaysClosingPrice);
            return this;
        }

        public Builder buildLastTradePrice(double lastTradePrice) {
            this.tag31LastPx = new Tag31LastPx(lastTradePrice);
            return this;
        }

        public Builder buildLastTradeQuantity(double lastTradeQuantity) {
            this.tag32LastQty = new Tag32LastQty(lastTradeQuantity);
            return this;
        }

        public Builder buildLastTradeTimeStamp(String lastTradeTimeStamp) {
            this.tag60TransactTime = new Tag60TransactTime(lastTradeTimeStamp);
            return this;
        }

        public FIXBody build() {
            return new FIXBody(this);
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        FIXBody record =
                new FIXBody.Builder()
                        .buildOpeningPrice(12.34D)
                        .buildPreviousDaysClosingPrice(56.78D)
                        .buildLastTradePrice(90.12D)
                        .buildLastTradeQuantity(123.4D)
                        .buildLastTradeTimeStamp("102346 EST")
                        .build();
        logger.trace(record);
        logger.trace(record.toLogStringVerbose());
    }
}

