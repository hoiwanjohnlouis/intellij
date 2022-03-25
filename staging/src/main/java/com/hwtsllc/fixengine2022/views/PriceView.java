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

import com.hwtsllc.fixengine2022.fix27.enums.Enum35MsgType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag35EtMsgType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag60TransactTime;
import com.hwtsllc.fixengine2022.fix40.OpeningPrice;

public class PriceView {
    private final OpeningPrice lastTradeOpeningPrice;
    private final Tag60TransactTime tag60TransactTime;

    //
    private PriceView(Builder builder) {
        this.lastTradeOpeningPrice = builder.lastTradeOpeningPrice;
        this.tag60TransactTime = builder.tag60TransactTime;
    }

    public OpeningPrice getLastTradePrice() {
        return lastTradeOpeningPrice;
    }

    public Tag60TransactTime getLastTradeTimeStamp() {
        return tag60TransactTime;
    }

    //
    public String toString(){
        return String.valueOf(lastTradeOpeningPrice)
                .concat("\n")
                .concat(String.valueOf(tag60TransactTime));
    }

    public static class Builder {

        private OpeningPrice lastTradeOpeningPrice;

        private Tag60TransactTime tag60TransactTime;

        //
        public Builder(Enum35MsgType enum35MsgType) {
            this.tag60TransactTime = new Tag60TransactTime("18991231235959");
        }
        public Builder buildTradePrice(OpeningPrice lastTradeOpeningPrice) {
            this.lastTradeOpeningPrice = lastTradeOpeningPrice;
            return this;
        }
        public Builder buildTradeTimeStamp(Tag60TransactTime tag60TransactTime) {
            this.tag60TransactTime = tag60TransactTime;
            return this;
        }
        public PriceView build() {
            return new PriceView(this);
        }
    }
    /**
     *
     * @param args      not used at this time
     */
    public static void main(String[] args) {
        PriceView view =
            new PriceView.Builder(Tag35EtMsgType.TESTA_ET_MSG_TYPE)
                    .buildTradePrice(new OpeningPrice(10.2D))
                    .buildTradeTimeStamp(new Tag60TransactTime("093000_000000"))
                    .build();
        System.out.println(view);
    }
}
