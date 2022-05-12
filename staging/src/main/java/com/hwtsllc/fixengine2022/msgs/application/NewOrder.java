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

import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.fix27.tags.Log60UtcTransactTime;
import com.hwtsllc.fixengine2022.fix40.tags.Log140PrcPrevClosePx;

public class NewOrder implements Comparable {
    private final Log140PrcPrevClosePx tag140PrcPrevClosePx;
    private final Log60UtcTransactTime tag60UtcTransactTime;

    //
    private NewOrder(Builder builder) {
        this.tag140PrcPrevClosePx = builder.tag140PrcPrevClosePx;
        this.tag60UtcTransactTime = builder.tag60UtcTransactTime;
    }

    public Log140PrcPrevClosePx getPreviousDaysClosingPrice() {
        return tag140PrcPrevClosePx;
    }
    public Log60UtcTransactTime getLastTradeTimeStamp() {
        return tag60UtcTransactTime;
    }

    // If any EnemyShip object is printed to screen this shows up
    @Override
    public String toString(){
        return super.toString()
                .concat(tag140PrcPrevClosePx.toString())
                .concat(" ")
                .concat(tag60UtcTransactTime.toString());
    }

    public int compareTo(Object o) {
        return 0;
    }

    // static builder helper class 
    public static class Builder {
        private StringBuilder stringBuilder = new StringBuilder();

        private Log140PrcPrevClosePx tag140PrcPrevClosePx;    // 4
        private Log60UtcTransactTime tag60UtcTransactTime;  // 8

        public Builder buildLastTradeTimeStamp(String lastTradeTimeStamp) {
            this.tag60UtcTransactTime = new Log60UtcTransactTime(new MyUTCTimestampType(lastTradeTimeStamp) );
            return this;
        }

        /**
         *
         * @return          a NewOrder object.
         */
        public NewOrder build() {
            return new NewOrder(this);
        }
    }

    /**
     *
     * @param args Not used
     */
    public static void main(String[] args) {
        System.out.println("New Order");
    }

}
