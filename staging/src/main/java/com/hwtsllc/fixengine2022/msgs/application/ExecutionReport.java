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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.datatypes.MyEnumMsgType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag55StrSymbol;

public class ExecutionReport {
    private final MyEnumMsgType tag35MsgType;
    private final Tag55StrSymbol tag55StrSymbol;

    //
    private ExecutionReport(ExecutionReport.Builder builder) {
        this.tag35MsgType = builder.tag35MsgType;
        this.tag55StrSymbol = builder.tag55StrSymbol;
    }

    @Override
    public String toString() {
        return "Message is:"
                .concat(tag35MsgType.toString())
                .concat(" ")
                .concat(tag55StrSymbol.toString())
                .concat(".");
    }

    public int compareTo(Object o) {
        return 0;
    }

    // static builder helper class
    public static class Builder {
        private StringBuilder stringBuilder = new StringBuilder();

        private MyEnumMsgType tag35MsgType;
        private Tag55StrSymbol tag55StrSymbol;              // 2

        // helper class to build object
        public Builder(MyEnumMsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
        }

        public Builder buildTickerSymbol(String tickerSymbol) {
            this.tag55StrSymbol = new Tag55StrSymbol(new MyStringType(tickerSymbol) );
            return this;
        }
        public ExecutionReport build() {
            return new ExecutionReport(this);
        }
    }

    /**
     *
     * @param args      not used at this time
     */
    public static void main(String[] args) {
        ExecutionReport record =
                new ExecutionReport.Builder(MyEnumMsgType.EXECUTION_REPORT)
                        .buildTickerSymbol(Tag55StrSymbol.TESTA_STR_SYMBOL)
                        .build();
        System.out.println(record);
    }
}
