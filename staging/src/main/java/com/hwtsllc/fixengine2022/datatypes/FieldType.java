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

package com.hwtsllc.fixengine2022.datatypes;

public enum FieldType {

    DEFAULT_LAST_TRADE_QUANTITY,
    DEFAULT_PREVIOUS_DAYS_CLOSING_PRICE,
    OPENING_PRICE,
    PREVIOUS_DAYS_CLOSING_PRICE,
    LAST_TRADE_PRICE,
    LAST_TRADE_QUANTITY,
    LAST_TRADE_TIME_STAMP;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name());

        return sb.toString();
    }
}
