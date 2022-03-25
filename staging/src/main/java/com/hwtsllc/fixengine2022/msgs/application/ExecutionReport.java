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

import com.hwtsllc.fixengine2022.datatypes.StringType;
import com.hwtsllc.fixengine2022.fix27.enums.Enum35MsgType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag55StSymbol;
import com.hwtsllc.fixengine2022.fix40.OpeningPrice;

public class ExecutionReport {
    private final Enum35MsgType tag35MsgType;
    private final Tag55StSymbol tag55StSymbol;
    private final OpeningPrice openingPrice;

    //
    private ExecutionReport(ExecutionReport.Builder builder) {
        this.tag35MsgType = builder.tag35MsgType;
        this.tag55StSymbol = builder.tag55StSymbol;
        this.openingPrice = builder.openingPrice;
    }

    // If any EnemyShip object is printed to screen this shows up
    @Override
    public String toString() {
        return String.valueOf(openingPrice.getPrice());
    }

    public int compareTo(Object o) {
        return 0;
    }

    // static builder helper class
    public static class Builder {
        private StringBuilder stringBuilder = new StringBuilder();

        private Enum35MsgType tag35MsgType;
        private Tag55StSymbol tag55StSymbol;              // 2
        private OpeningPrice openingPrice;              // 3

        // helper class to build object
        public Builder(Enum35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
        }

        public Builder buildTickerSymbol(String tickerSymbol) {
            this.tag55StSymbol = new Tag55StSymbol(new StringType(tickerSymbol) );
            return this;
        }
        public Builder buildOpeningPrice(double openingPrice) {
            this.openingPrice = new OpeningPrice(openingPrice);
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
                new ExecutionReport.Builder(Enum35MsgType.EXECUTION_REPORT)
                        .buildTickerSymbol(Tag55StSymbol.TESTA_ST_SYMBOL)
                        .buildOpeningPrice(12.34D)
                        .build();
        System.out.println(record);
    }
}
