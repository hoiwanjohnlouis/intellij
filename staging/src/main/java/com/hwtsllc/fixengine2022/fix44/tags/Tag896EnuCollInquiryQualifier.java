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
import com.hwtsllc.fixengine2022.fix44.enums.Enum896CollInquiryQualifier;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  896
 *  CollInquiryQualifier
 *  int
 *  Collateral inquiry qualifiers:
 *  Valid values:
 *      0 - Trade Date
 *      1 - GC Instrument
 *      2 - Collateral Instrument
 *      3 - Substitution Eligible
 *      4 - Not Assigned
 *      5 - Partially Assigned
 *      6 - Fully Assigned
 *      7 - Outstanding Trades (Today < end date)
 */
public class Tag896EnuCollInquiryQualifier extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum896CollInquiryQualifier dataValue;

    public final static Enum896CollInquiryQualifier TESTA_ENU_COLL_INQUIRY_QUALIFIER
            = Enum896CollInquiryQualifier.COLLATERAL_INSTRUMENT;
    public final static Enum896CollInquiryQualifier TESTB_ENU_COLL_INQUIRY_QUALIFIER
            = Enum896CollInquiryQualifier.NOT_ASSIGNED;

    public Tag896EnuCollInquiryQualifier(Enum896CollInquiryQualifier dataValue) {
        setFixType(FIX44.FIX896_ENU_COLL_INQUIRY_QUALIFIER);
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
        Tag896EnuCollInquiryQualifier tagData;

        tagData = new Tag896EnuCollInquiryQualifier(TESTA_ENU_COLL_INQUIRY_QUALIFIER);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag896EnuCollInquiryQualifier(TESTB_ENU_COLL_INQUIRY_QUALIFIER);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
