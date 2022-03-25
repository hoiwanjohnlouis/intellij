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

import com.hwtsllc.fixengine2022.fix27.tags.Tag35EtMsgType;
import com.hwtsllc.fixengine2022.fix40.OpeningPrice;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TradeView {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final OpeningPrice openingPrice;
    private final OpeningPrice previousDaysClosingPrice;
    private final OpeningPrice lastTradeOpeningPrice;
    private final StringBuilder stringBuilder = new StringBuilder();

    private TradeView(TradeViewBuilder tradeViewBuilder) {
        this.openingPrice = tradeViewBuilder.openingPrice;
        this.previousDaysClosingPrice = tradeViewBuilder.previousDaysClosingPrice;
        this.lastTradeOpeningPrice = tradeViewBuilder.lastTradeOpeningPrice;
    }

    @Override
    public String toString(){
        stringBuilder.setLength(0);
        stringBuilder.append(openingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(previousDaysClosingPrice);
        stringBuilder.append("\n");
        stringBuilder.append(lastTradeOpeningPrice);

        return stringBuilder.toString();
    }


    // static helper class to build tradeview
    public static class TradeViewBuilder {
        private OpeningPrice openingPrice;
        private OpeningPrice previousDaysClosingPrice;
        private OpeningPrice lastTradeOpeningPrice;

        // static helper class to build object
        public TradeViewBuilder(Tag35EtMsgType tag35EtMsgType) {
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

        /**
         *
         * @return      a trade object.
         */
        public TradeView build() {
            return new TradeView(this);
        }
    }
}