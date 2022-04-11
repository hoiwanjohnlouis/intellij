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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.fix42.enums.Enum368QuoteEntryRejectReason;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public class Tag368EnuQuoteEntryRejectReason extends FIX42Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum368QuoteEntryRejectReason dataValue;

    public final static Enum368QuoteEntryRejectReason TESTA_ENU_QUOTE_ENTRY_REJECT_REASON
            = Enum368QuoteEntryRejectReason.NOT_AUTHORIZED_TO_QUOTE_SECURITY;
    public final static Enum368QuoteEntryRejectReason TESTB_ENU_QUOTE_ENTRY_REJECT_REASON
            = Enum368QuoteEntryRejectReason.QUOTE_EXCEEDS_LIMIT;

    public Tag368EnuQuoteEntryRejectReason(Enum368QuoteEntryRejectReason dataValue) {
        setFixType(FIX42.FIX368_ENU_QUOTE_ENTRY_REJECT_REASON);
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
        Tag368EnuQuoteEntryRejectReason tagData;

        tagData = new Tag368EnuQuoteEntryRejectReason(TESTA_ENU_QUOTE_ENTRY_REJECT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag368EnuQuoteEntryRejectReason(TESTB_ENU_QUOTE_ENTRY_REJECT_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
