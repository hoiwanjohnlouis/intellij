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

package com.hwtsllc.fixengine2022.views;

import com.hwtsllc.fixengine2022.fix27.tags.Tag31LastPx;
import com.hwtsllc.fixengine2022.fix27.tags.Tag32LastQty;
import com.hwtsllc.fixengine2022.fix27.tags.Tag35MsgType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag60TransactTime;
import com.hwtsllc.fixengine2022.fix40.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TradeView {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final OpeningPrice openingPrice;
    private final OpeningPrice previousDaysClosingPrice;
    private final OpeningPrice lastTradeOpeningPrice;
    private final Tag32LastQty tag32LastQty;
    private final Tag60TransactTime tag60TransactTime;
    private final StringBuilder stringBuilder = new StringBuilder();

    private TradeView(TradeViewBuilder tradeViewBuilder) {
        this.openingPrice = tradeViewBuilder.openingPrice;
        this.previousDaysClosingPrice = tradeViewBuilder.previousDaysClosingPrice;
        this.lastTradeOpeningPrice = tradeViewBuilder.lastTradeOpeningPrice;
        this.tag32LastQty = tradeViewBuilder.tag32LastQty;
        this.tag60TransactTime = tradeViewBuilder.tag60TransactTime;
    }

    @Override
    public String toString(){
        stringBuilder.setLength(0);
        stringBuilder.append(openingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(previousDaysClosingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeOpeningPrice);
        stringBuilder.append("\n");
        stringBuilder.append(tag32LastQty);
        stringBuilder.append("\n");
        stringBuilder.append(tag60TransactTime);

        return stringBuilder.toString();
    }


    // static helper class to build tradeview
    public static class TradeViewBuilder {

        // for logging purposes
        private final String DEBUG_TAG = this.getClass().getSimpleName();

        private OpeningPrice openingPrice;
        private OpeningPrice previousDaysClosingPrice;
        private OpeningPrice lastTradeOpeningPrice;
        private Tag32LastQty tag32LastQty;
        private Tag60TransactTime tag60TransactTime;

        // static helper class to build object
        public TradeViewBuilder(Tag35MsgType tag35MsgType) {
            this.openingPrice = new OpeningPrice(Tag31LastPx.TESTA_SYMBOL_LAST_PX);
            this.previousDaysClosingPrice = new OpeningPrice(Tag31LastPx.TESTA_SYMBOL_LAST_PX);
            this.lastTradeOpeningPrice = new OpeningPrice(Tag31LastPx.TESTA_SYMBOL_LAST_PX);
            this.tag32LastQty = new Tag32LastQty();
            this.tag60TransactTime = new Tag60TransactTime(Tag60TransactTime.TESTA_TRANSACT_TIME);
        }

        public TradeViewBuilder buildOpeningPrice(OpeningPrice openingPrice) {
            this.openingPrice = openingPrice;
            return this;
        }
        public TradeViewBuilder buildPreviousDaysClosingPrice(OpeningPrice previousDaysClosingPrice) {
            this.previousDaysClosingPrice = previousDaysClosingPrice;
            return this;
        }
        public TradeViewBuilder buildTradePrice(OpeningPrice lastTradeOpeningPrice) {
            this.lastTradeOpeningPrice = lastTradeOpeningPrice;
            return this;
        }
        public TradeViewBuilder buildTradeQuantity(Tag32LastQty tag32LastQty) {
            this.tag32LastQty = tag32LastQty;
            return this;
        }
        public TradeViewBuilder buildTradeTimeStamp(Tag60TransactTime tag60TransactTime) {
            this.tag60TransactTime = tag60TransactTime;
            return this;
        }

        /**
         *
         * @return      a trade object.
         */
        public TradeView build() {
            return new TradeView(this);
        }
    }
}