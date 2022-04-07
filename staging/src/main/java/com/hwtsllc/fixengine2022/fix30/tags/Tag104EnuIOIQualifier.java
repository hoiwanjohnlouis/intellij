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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.FIX30Abstract;
import com.hwtsllc.fixengine2022.fix30.enums.Enum104IOIQualifier;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag104EnuIOIQualifier extends FIX30Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum104IOIQualifier dataValue;

    public final static Enum104IOIQualifier TESTA_ENU_IOI_QUALIFIER = Enum104IOIQualifier.ALL_OR_NONE; // fake data
    public final static Enum104IOIQualifier TESTB_ENU_IOI_QUALIFIER = Enum104IOIQualifier.PRE_OPEN;

    public Tag104EnuIOIQualifier(Enum104IOIQualifier dataValue) {
        setFixType(FIX30.FIX104_ENU_IOI_QUALIFIER);
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
        Tag104EnuIOIQualifier tagData;

        tagData = new Tag104EnuIOIQualifier(TESTA_ENU_IOI_QUALIFIER);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag104EnuIOIQualifier(TESTB_ENU_IOI_QUALIFIER);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
