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

import com.hwtsllc.fixengine2022.fix40.OpeningPrice;
import com.hwtsllc.fixengine2022.fix40.tags.Tag140PrevClosePx;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FIXBody implements LogStringVerbose {
    private static final Logger logger = LogManager.getRootLogger();

    private final OpeningPrice openingPrice;
    private final Tag140PrevClosePx tag140PrevClosePx;

    //
    private FIXBody(FIXBody.Builder builder) {
        this.openingPrice = builder.openingPrice;
        this.tag140PrevClosePx = builder.tag140PrevClosePx;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder
            .append(openingPrice.getPrice());
        return stringBuilder.toString();
    }
    @Override
    public String toLogStringVerbose() {
        StringBuilder stringBuilder = new StringBuilder();

        // clean up the buffer before using.
        stringBuilder
            .append(openingPrice)
            .append("\n\t")
            .append(tag140PrevClosePx);

        return stringBuilder.toString();
    }

//    public int compareTo(Object o) {
//        return 0;
//    }

    // static builder helper class
    public static class Builder {
        private OpeningPrice openingPrice;              // 3
        private Tag140PrevClosePx tag140PrevClosePx;    // 4

        // helper class to build object
        public Builder() {
        }

        public Builder buildOpeningPrice(double openingPrice) {
            this.openingPrice = new OpeningPrice(openingPrice);
            return this;
        }

        public Builder buildPreviousDaysClosingPrice(double previousDaysClosingPrice) {
            this.tag140PrevClosePx = new Tag140PrevClosePx(String.valueOf(previousDaysClosingPrice));
            return this;
        }

        public FIXBody build() {
            return new FIXBody(this);
        }
    }

    /**
     *
     * @param args   not used yet
     */
    public static void main(String[] args) {
        FIXBody record =
                new FIXBody.Builder()
                        .buildOpeningPrice(12.34D)
                        .buildPreviousDaysClosingPrice(56.78D)
                        .build();
        logger.trace(record);
        logger.trace(record.toLogStringVerbose());
        System.out.println(record);
        System.out.println(record.toLogStringVerbose());
    }
}