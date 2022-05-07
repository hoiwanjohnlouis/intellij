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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumPartyIDSource;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  1060 (same as 447, 525, 758, 783, 950, 1050, 1060, 1118)
 *  UndlyInstrumentPartyIDSource
 *  PartyIDSource value within an underlying instrument partyrepeating group.
 *              Same values as  PartyIDSource (447)
 *  Valid values:
 *  For all PartyRoles
 *      B - BIC (Bank Identification Code - SWIFT managed) code
 *              (ISO9362 - See "Appendix 6-B")
 *      C - Generally accepted market participant identifier
 *              (e.g. NASD mnemonic)
 *      D - Proprietary / Custom code
 *      E - ISO Country Code
 *      F - Settlement Entity Location
 *              (note if Local Market Settlement use "E=ISO Country Code")
 *              (see "Appendix 6-G" for valid values)
 *      G - MIC (ISO 10383 - Market Identificer Code) (See "Appendix 6-C")
 *      H - CSD participant/member code
 *              (e.g.. Euroclear, DTC, CREST or Kassenverein number)
 *
 *  For PartyRole = "InvestorID" and for CIV
 *      6 - UK National Insurance or Pension Number
 *      7 - US Social Security Number
 *      8 - US Employer or Tax ID Number
 *      9 - Australian Business Number
 *      A - Australian Tax File Number
 *
 *  For PartyRole = "InvestorID" and for Equities
 *      1 - Korean Investor ID
 *      2 - Taiwanese Qualified Foreign Investor ID QFII/FID
 *      3 - Taiwanese Trading Acct
 *      4 - Malaysian Central Depository (MCD) number
 *      5 - Chinese Investor ID
 *
 *  For PartyRole="Broker of Credit"
 *      I - Directed broker three character acronym as defined in
 *              ISITC "ETC Best Practice" guidelines document
 */
public class Tag1060UndlyInstrumentPartyIDSource extends FIX50Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumPartyIDSource dataValue;

    public final static MyEnumPartyIDSource TESTA_ENU_UNDLY_INSTRUMENT_PARTY_ID_SOURCE
            = MyEnumPartyIDSource.KOREAN_INVESTOR_ID;
    public final static MyEnumPartyIDSource TESTB_ENU_UNDLY_INSTRUMENT_PARTY_ID_SOURCE
            = MyEnumPartyIDSource.BANK_IDENTIFICATION_CODE;

    public Tag1060UndlyInstrumentPartyIDSource(MyEnumPartyIDSource dataValue) {
        setFixType(FIX50.FIX1060_ENU_UNDLY_INSTRUMENT_PARTY_ID_SOURCE);
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
        Tag1060UndlyInstrumentPartyIDSource tagData;

        tagData = new Tag1060UndlyInstrumentPartyIDSource(TESTA_ENU_UNDLY_INSTRUMENT_PARTY_ID_SOURCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag1060UndlyInstrumentPartyIDSource(TESTB_ENU_UNDLY_INSTRUMENT_PARTY_ID_SOURCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
