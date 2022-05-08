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
import com.hwtsllc.fixengine2022.datatypes.MyEnumQualifier;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  104 (same as 104, 695)
 *  IOIQualifier
 *  char
 *  Code to qualify IOI use.  (see Volume : "Glossary" for value definitions)
 *  695  (same as 104, 695)
 *  QuoteQualifier
 *  char
 *  Code to qualify Quote use
 *          See IOIQualifier (104) for description and valid values.
 *  Valid values:
 *      A - All or None (AON)
 *      B - Market On Close (MOC) (held to close)
 *      C - At the close (around/not held to close)
 *      D - VWAP (Volume Weighted Average Price)
 *      I - In touch with
 *      L - Limit
 *      M - More Behind
 *      O - At the Open
 *      P - Taking a Position
 *      Q - At the Market (previously called Current Quote)
 *      R - Ready to Trade
 *      S - Portfolio Shown
 *      T - Through the Day
 *      V - Versus
 *      W - Indication -  Working Away
 *      X - Crossing Opportunity
 *      Y - At the Midpoint
 *      Z - Pre-open
 */
public class Tag695EnuQuoteQualifier extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumQualifier dataValue;

    public final static MyEnumQualifier TESTA_ENU_QUOTE_QUALIFIER
            = MyEnumQualifier.ALL_OR_NONE;
    public final static MyEnumQualifier TESTB_ENU_QUOTE_QUALIFIER
            = MyEnumQualifier.AT_THE_MARKET;

    public Tag695EnuQuoteQualifier(MyEnumQualifier dataValue) {
        setFixType(FIX44.FIX695_ENU_QUOTE_QUALIFIER);
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
        Tag695EnuQuoteQualifier tagData;

        tagData = new Tag695EnuQuoteQualifier(TESTA_ENU_QUOTE_QUALIFIER);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag695EnuQuoteQualifier(TESTB_ENU_QUOTE_QUALIFIER);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
