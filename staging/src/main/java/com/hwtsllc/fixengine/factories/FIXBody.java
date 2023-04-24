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

package com.hwtsllc.fixengine.factories;

import com.hwtsllc.fixengine.interfaces.LogVerboseString;

public class FIXBody implements LogVerboseString {

    private FIXBody(FIXBody.Builder builder) {
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public String toVerboseString() {
        return null;
    }

//    public int compareTo(Object o) {
//        return 0;
//    }

    // static builder helper class
    public static class Builder {

        // helper class to build object
        public Builder() {
        }

        public Builder buildPreviousDaysClosingPrice(double previousDaysClosingPrice) {
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
        System.out.println(record.toVerboseString());
    }
}