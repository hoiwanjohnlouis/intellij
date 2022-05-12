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

import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.datatypes.MyEnumMsgType;
import com.hwtsllc.fixengine2022.fix27.tags.Log60UtcTransactTime;
import com.hwtsllc.fixengine2022.fix27.tags.Log35EnuMsgType;

public class PriceView {
    private final Log60UtcTransactTime tag60UtcTransactTime;

    //
    private PriceView(Builder builder) {
        this.tag60UtcTransactTime = builder.tag60UtcTransactTime;
    }

    public Log60UtcTransactTime getLastTradeTimeStamp() {
        return tag60UtcTransactTime;
    }

    //
    public String toString(){
        return String.valueOf(tag60UtcTransactTime);
    }

    public static class Builder {
        private Log60UtcTransactTime tag60UtcTransactTime;

        //
        public Builder(MyEnumMsgType myEnumMsgType) {
            this.tag60UtcTransactTime = new Log60UtcTransactTime(new MyUTCTimestampType("18991231235959") );
        }
        public Builder buildTradeTimeStamp(Log60UtcTransactTime tag60UtcTransactTime) {
            this.tag60UtcTransactTime = tag60UtcTransactTime;
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
            new PriceView.Builder(Log35EnuMsgType.TESTA_ENU_MSG_TYPE)
                    .buildTradeTimeStamp(new Log60UtcTransactTime(new MyUTCTimestampType("093000_000000") ))
                    .build();
        System.out.println(view);
    }
}
