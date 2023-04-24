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

package com.hwtsllc.fixengine.views;

import com.hwtsllc.fixengine.tags.fix27.Tag35EnuMsgType;

public class TradeView {
    private final StringBuilder stringBuilder = new StringBuilder();

    private TradeView(TradeViewBuilder tradeViewBuilder) {
        stringBuilder.setLength(0);
    }

    @Override
    public String toString(){
        return "stringBuilder:"
                .concat(stringBuilder.toString())
                .concat(".");
    }

    // static helper class to build tradeview
    public static class TradeViewBuilder {
        // static helper class to build object
        public TradeViewBuilder(Tag35EnuMsgType tag35EnuMsgType) {
        }

        /**
         *
         * @return      a trade object.
         */
        public TradeView build() {
            return new TradeView(this);
        }
    }


    /**
     *
     * @param args      args not used at this time
     */
    public static void main(String[] args) {
        System.out.println("TradeView routine.");
    }
}
