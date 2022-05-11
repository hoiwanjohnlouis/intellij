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

public interface MyTestValues {
    /*
     * public final static fields
     * used in @Test routine.
     */
    String JUNK_ENUM_NAME = "JunkEnumName";
    String JUNK_ID = "JunkID";
    String JUNK_NAME = "JunkName";
    String JUNK_DESCRIPTION = "JunkDescription";

    double JUNK_AMT_DATA_VALUE = -65535D;                           //  MyAmtType
    String JUNK_DAT_DATA_VALUE = "JunkMyDataType";                  //  MyDataType
    char JUNK_CHA_DATA_VALUE = '\\';                                //  MyCharType
    String JUNK_EXC_DATA_VALUE = "JunkMyExchangeType";              //  MyExchangeType
    float JUNK_FLO_DATA_VALUE = -65535F;                            //  MyFloatType
    int JUNK_INT_DATA_VALUE = -65535;                               //  MyIntType
    int JUNK_LEN_DATA_VALUE = -65535;                               //  MyLengthType
    String JUNK_LMD_DATA_VALUE = "JunkMyLocalMktDateType";          //  MyLocalMktDateType
    int JUNK_NUM_DATA_VALUE = -65535;                               //  MyNumInGroupType
    double JUNK_PCT_DATA_VALUE = -0.05D;                            //  MyPercentageType
    double JUNK_PXO_DATA_VALUE = -0.032D;                           //  MyPriceOffsetType
    double JUNK_PRC_DATA_VALUE = -65535D;                           //  MyPriceType
    int JUNK_QTY_DATA_VALUE = -65535;                               //  MyQtyType
    int JUNK_SEQ_DATA_VALUE = -65535;                               //  MySeqNumType
    String JUNK_STR_DATA_VALUE = "JunkMyStringType";                //  MyStringType
    String JUNK_UTC_DATA_VALUE = "18991231_235959";                 //  MyUTCTimestampType
    String JUNK_UTCD_DATA_VALUE = "00001332";                       //  MyUTCDateType
    String JUNK_UTCT_DATA_VALUE = "444444";                         //  MyUTCTimeType
}
