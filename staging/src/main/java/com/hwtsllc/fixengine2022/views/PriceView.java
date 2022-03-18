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

import com.hwtsllc.fixengine2022.fix27.tags.Tag35MsgType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag60TransactTime;
import com.hwtsllc.fixengine2022.fix40.OpeningPrice;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PriceView {
    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final OpeningPrice lastTradeOpeningPrice;
    private final Tag60TransactTime tag60TransactTime;

    //
    private PriceView(PriceViewBuilder priceViewBuilder) {
        this.lastTradeOpeningPrice = priceViewBuilder.lastTradeOpeningPrice;
        this.tag60TransactTime = priceViewBuilder.tag60TransactTime;
    }

    public OpeningPrice getLastTradePrice() {
        return lastTradeOpeningPrice;
    }

    public Tag60TransactTime getLastTradeTimeStamp() {
        return tag60TransactTime;
    }

    //
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lastTradeOpeningPrice);
        stringBuilder.append("\n");
        stringBuilder.append("\n");
        stringBuilder.append(tag60TransactTime);

        return stringBuilder.toString();
    }

    public static class PriceViewBuilder {

        // for logging purposes
        private final String DEBUG_TAG = this.getClass().getSimpleName();

        private OpeningPrice lastTradeOpeningPrice;

        private Tag60TransactTime tag60TransactTime;

        //
        public PriceViewBuilder(Tag35MsgType tag35MsgType) {
            this.tag60TransactTime = new Tag60TransactTime("18991231235959");
        }
        public PriceViewBuilder buildTradePrice(OpeningPrice lastTradeOpeningPrice) {
            this.lastTradeOpeningPrice = lastTradeOpeningPrice;
            return this;
        }
        public PriceViewBuilder buildTradeTimeStamp(Tag60TransactTime tag60TransactTime) {
            this.tag60TransactTime = tag60TransactTime;
            return this;
        }
        public PriceView build() {
            return new PriceView(this);
        }
    }
}
