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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum827ExpirationCycle;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  827
 *  ExpirationCycle
 *  int
 *  Part of trading cycle when an instrument expires. Field is applicable for derivatives.
 *  Valid values:
 *      0 - Expire on trading session close (default)
 *      1 - Expire on trading session open
 */
public class Tag827EnuExpirationCycle extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum827ExpirationCycle dataValue;

    public final static Enum827ExpirationCycle TESTA_ENU_EXPIRATION_CYCLE
            = Enum827ExpirationCycle.EXPIRE_ON_CLOSE;
    public final static Enum827ExpirationCycle TESTB_ENU_EXPIRATION_CYCLE
            = Enum827ExpirationCycle.EXPIRE_ON_OPEN;

    public Tag827EnuExpirationCycle(Enum827ExpirationCycle dataValue) {
        setFixType(FIX44.FIX827_ENU_EXPIRATION_CYCLE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag827EnuExpirationCycle tagData;

        tagData = new Tag827EnuExpirationCycle(TESTA_ENU_EXPIRATION_CYCLE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag827EnuExpirationCycle(TESTB_ENU_EXPIRATION_CYCLE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
