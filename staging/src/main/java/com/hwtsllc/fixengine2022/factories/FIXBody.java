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

import com.hwtsllc.fixengine2022.datatypes.MyPriceType;
import com.hwtsllc.fixengine2022.fix40.tags.Tag140PrcPrevClosePx;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class FIXBody implements LogStringVerbose {
    private final Tag140PrcPrevClosePx tag140PrcPrevClosePx;

    //
    private FIXBody(FIXBody.Builder builder) {
        this.tag140PrcPrevClosePx = builder.tag140PrcPrevClosePx;
    }

    @Override
    public String toString() {
        return super.toString()
                .concat(tag140PrcPrevClosePx.toString());
    }
    @Override
    public String toLogStringVerbose() {
        return tag140PrcPrevClosePx.toLogStringVerbose();
    }

//    public int compareTo(Object o) {
//        return 0;
//    }

    // static builder helper class
    public static class Builder {
        private Tag140PrcPrevClosePx tag140PrcPrevClosePx;    // 4

        // helper class to build object
        public Builder() {
        }

        public Builder buildPreviousDaysClosingPrice(double previousDaysClosingPrice) {
            this.tag140PrcPrevClosePx = new Tag140PrcPrevClosePx(new MyPriceType("12.34") );
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
                        .buildPreviousDaysClosingPrice(56.78D)
                        .build();
        System.out.println(record);
        System.out.println(record.toLogStringVerbose());
    }
}