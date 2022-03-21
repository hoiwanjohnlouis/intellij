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

import com.hwtsllc.fixengine2022.fix27.enums.Enum35MsgType;
import com.hwtsllc.fixengine2022.fix27.tags.Tag55Symbol;
import com.hwtsllc.fixengine2022.fix40.OpeningPrice;

public class ExecutionReport {
    private final Enum35MsgType tag35MsgType;
    private final Tag55Symbol tag55Symbol;
    private final OpeningPrice openingPrice;

    //
    private ExecutionReport(ExecutionReport.Builder builder) {
        this.tag35MsgType = builder.tag35MsgType;
        this.tag55Symbol = builder.tag55Symbol;
        this.openingPrice = builder.openingPrice;
    }

    // If any EnemyShip object is printed to screen this shows up
    @Override
    public String toString() {

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
        private StringBuilder stringBuilder = new StringBuilder();

        private Enum35MsgType tag35MsgType;
        private Tag55Symbol tag55Symbol;              // 2
        private OpeningPrice openingPrice;              // 3

        // helper class to build object
        public Builder(Enum35MsgType tag35MsgType) {
            this.tag35MsgType = tag35MsgType;
        }

        public Builder buildTickerSymbol(String tickerSymbol) {
            this.tag55Symbol = new Tag55Symbol(tickerSymbol);
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
     * @param args
     */
    public static void main(String[] args) {
        ExecutionReport record =
                new ExecutionReport.Builder(Enum35MsgType.EXECUTION_REPORT)
                        .buildTickerSymbol(Tag55Symbol.TESTA_SYMBOL)
                        .buildOpeningPrice(12.34D)
                        .build();
    }

}
