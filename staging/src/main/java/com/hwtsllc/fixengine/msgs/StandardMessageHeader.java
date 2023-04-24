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

package com.hwtsllc.fixengine.msgs;

import com.hwtsllc.fixengine.datatypes.*;
import com.hwtsllc.fixengine.tags.fix27.*;
import com.hwtsllc.fixengine.enums.fix27.Enum8BeginString;
import com.hwtsllc.fixengine.tags.fix27.tags.*;
import com.hwtsllc.fixengine.tags.fix40.*;
import com.hwtsllc.fixengine.tags.fix40.tags.*;
import com.hwtsllc.fixengine.tags.fix41.Tag142StrSenderLocationID;
import com.hwtsllc.fixengine.tags.fix41.Tag143StrTargetLocationID;
import com.hwtsllc.fixengine.tags.fix41.Tag144StrOnBehalfOfLocationID;
import com.hwtsllc.fixengine.tags.fix41.Tag145StrDeliverToLocationID;
import com.hwtsllc.fixengine.tags.fix42.*;

public class StandardMessageHeader {
    // Tags are ordered by FIX Protocol Specification
    private final Tag8EnuBeginString tag8EnuBeginString;
    private final Tag9LenBodyLength tag9LenBodyLength;
    private final Tag35EnuMsgType tag35EnuMsgType;
    private final Tag49StrSenderCompID tag49StrSenderCompID;
    private final Tag56StrTargetCompID tag56StrTargetCompID;
    private final Tag115StrOnBehalfOfCompID tag115StrOnBehalfOfCompID;
    private final Tag128StrDeliverToCompID tag128StrDeliverToCompID;
    private final Tag90LenSecureDataLen tag90LenSecureDataLen;
    private final Tag91DatSecureData tag91DatSecureData;
    private final Tag34SeqMsgSeqNum tag34SeqMsgSeqNum;
    private final Tag50StrSenderSubID tag50StrSenderSubID;
    private final Tag142StrSenderLocationID tag142StrSenderLocationID;
    private final Tag57StrTargetSubID tag57StrTargetSubID;
    private final Tag143StrTargetLocationID tag143StrTargetLocationID;
    private final Tag116StrOnBehalfOfSubID tag116StrOnBehalfOfSubID;
    private final Tag144StrOnBehalfOfLocationID tag144StrOnBehalfOfLocationID;
    private final Tag129StrDeliverToSubID tag129StrDeliverToSubID;
    private final Tag145StrDeliverToLocationID tag145StrDeliverToLocationID;
    private final Tag43EnuPossDupFlag tag43EnuPossDupFlag;
    private final Tag97EnuPossResend tag97EnuPossResend;
    private final Tag52UtcSendingTime tag52UtcSendingTime;
    private final Tag122UtcOrigSendingTime tag122UtcOrigSendingTime;
    private final Tag212LenXmlDataLen tag212LenXmlDataLen;
    private final Tag213DatXmlData tag213DatXmlData;
    private final Tag347StrMessageEncoding tag347StrMessageEncoding;
    private final Tag369SeqLastMsgSeqNumProcessed tag369SeqLastMsgSeqNumProcessed;
    private final Tag370UtcOnBehalfOfSendingTime tag370UtcOnBehalfOfSendingTime;

    private StandardMessageHeader( BuildHeader builder ) {
        this.tag8EnuBeginString = builder.tag8EnuBeginString;
        this.tag9LenBodyLength = builder.tag9LenBodyLength;
        this.tag35EnuMsgType = builder.tag35EnuMsgType;
        this.tag49StrSenderCompID = builder.tag49StrSenderCompID;
        this.tag56StrTargetCompID = builder.tag56StrTargetCompID;
        this.tag115StrOnBehalfOfCompID = builder.tag115StrOnBehalfOfCompID;
        this.tag128StrDeliverToCompID = builder.tag128StrDeliverToCompID;
        this.tag90LenSecureDataLen = builder.tag90LenSecureDataLen;
        this.tag91DatSecureData = builder.tag91DatSecureData;
        this.tag34SeqMsgSeqNum = builder.tag34SeqMsgSeqNum;
        this.tag50StrSenderSubID = builder.tag50StrSenderSubID;
        this.tag142StrSenderLocationID = builder.tag142StrSenderLocationID;
        this.tag57StrTargetSubID = builder.tag57StrTargetSubID;
        this.tag143StrTargetLocationID = builder.tag143StrTargetLocationID;
        this.tag116StrOnBehalfOfSubID = builder.tag116StrOnBehalfOfSubID;
        this.tag144StrOnBehalfOfLocationID = builder.tag144StrOnBehalfOfLocationID;
        this.tag129StrDeliverToSubID = builder.tag129StrDeliverToSubID;
        this.tag145StrDeliverToLocationID = builder.tag145StrDeliverToLocationID;
        this.tag43EnuPossDupFlag = builder.tag43EnuPossDupFlag;
        this.tag97EnuPossResend = builder.tag97EnuPossResend;
        this.tag52UtcSendingTime = builder.tag52UtcSendingTime;
        this.tag122UtcOrigSendingTime = builder.tag122UtcOrigSendingTime;
        this.tag212LenXmlDataLen = builder.tag212LenXmlDataLen;
        this.tag213DatXmlData = builder.tag213DatXmlData;
        this.tag347StrMessageEncoding = builder.tag347StrMessageEncoding;
        this.tag369SeqLastMsgSeqNumProcessed = builder.tag369SeqLastMsgSeqNumProcessed;
        this.tag370UtcOnBehalfOfSendingTime = builder.tag370UtcOnBehalfOfSendingTime;
    }

    // Getters in order by FIX Protocol Specification
    public Tag8EnuBeginString getTag8EnuBeginString() {
        return this.tag8EnuBeginString;
    }
    public Tag9LenBodyLength getTag9LenBodyLength() {
        return this.tag9LenBodyLength;
    }
    public Tag35EnuMsgType getTag35EnuMsgType() {
        return this.tag35EnuMsgType;
    }
    public Tag49StrSenderCompID getTag49StrSenderCompID() {
        return this.tag49StrSenderCompID;
    }
    public Tag56StrTargetCompID getTag56StrTargetCompID() {
        return this.tag56StrTargetCompID;
    }
    public Tag115StrOnBehalfOfCompID getTag115StrOnBehalfOfCompID() {
        return this.tag115StrOnBehalfOfCompID;
    }
    public Tag128StrDeliverToCompID getTag128StrDeliverToCompID() {
        return this.tag128StrDeliverToCompID;
    }
    public Tag90LenSecureDataLen getTag90LenSecureDataLen() {
        return this.tag90LenSecureDataLen;
    }
    public Tag91DatSecureData getTag91DatSecureData() {
        return this.tag91DatSecureData;
    }
    public Tag34SeqMsgSeqNum getTag34SeqMsgSeqNum() {
        return this.tag34SeqMsgSeqNum;
    }
    public Tag50StrSenderSubID getTag50StrSenderSubID() {
        return this.tag50StrSenderSubID;
    }
    public Tag142StrSenderLocationID getTag142StrSenderLocationID() {
        return this.tag142StrSenderLocationID;
    }
    public Tag57StrTargetSubID getTag57StrTargetSubID() {
        return this.tag57StrTargetSubID;
    }
    public Tag143StrTargetLocationID getTag143StrTargetLocationID() {
        return this.tag143StrTargetLocationID;
    }
    public Tag116StrOnBehalfOfSubID getTag116StrOnBehalfOfSubID() {
        return this.tag116StrOnBehalfOfSubID;
    }
    public Tag144StrOnBehalfOfLocationID getTag144StrOnBehalfOfLocationID() {
        return this.tag144StrOnBehalfOfLocationID;
    }
    public Tag129StrDeliverToSubID getTag129StrDeliverToSubID() {
        return this.tag129StrDeliverToSubID;
    }
    public Tag145StrDeliverToLocationID getTag145StrDeliverToLocationID() {
        return this.tag145StrDeliverToLocationID;
    }
    public Tag43EnuPossDupFlag getTag43EnuPossDupFlag() {
        return this.tag43EnuPossDupFlag;
    }
    public Tag97EnuPossResend getTag97EnuPossResend() {
        return this.tag97EnuPossResend;
    }
    public Tag52UtcSendingTime getTag52UtcSendingTime() {
        return this.tag52UtcSendingTime;
    }
    public Tag122UtcOrigSendingTime getTag122UtcOrigSendingTime() {
        return this.tag122UtcOrigSendingTime;
    }
    public Tag212LenXmlDataLen getTag212LenXmlDataLen() {
        return this.tag212LenXmlDataLen;
    }
    public Tag213DatXmlData getTag213DatXmlData() {
        return this.tag213DatXmlData;
    }
    public Tag347StrMessageEncoding getTag347StrMessageEncoding() {
        return this.tag347StrMessageEncoding;
    }
    public Tag369SeqLastMsgSeqNumProcessed getTag369SeqLastMsgSeqNumProcessed() {
        return this.tag369SeqLastMsgSeqNumProcessed;
    }
    public Tag370UtcOnBehalfOfSendingTime getTag370UtcOnBehalfOfSendingTime() {
        return this.tag370UtcOnBehalfOfSendingTime;
    }

    // BuildHeader for header
    public static class BuildHeader {
        private final Tag8EnuBeginString tag8EnuBeginString;
        private Tag9LenBodyLength tag9LenBodyLength;
        private Tag35EnuMsgType tag35EnuMsgType;
        private Tag49StrSenderCompID tag49StrSenderCompID;
        private Tag56StrTargetCompID tag56StrTargetCompID;
        private Tag115StrOnBehalfOfCompID tag115StrOnBehalfOfCompID;
        private Tag128StrDeliverToCompID tag128StrDeliverToCompID;
        private Tag90LenSecureDataLen tag90LenSecureDataLen;
        private Tag91DatSecureData tag91DatSecureData;
        private Tag34SeqMsgSeqNum tag34SeqMsgSeqNum;
        private Tag50StrSenderSubID tag50StrSenderSubID;
        private Tag142StrSenderLocationID tag142StrSenderLocationID;
        private Tag57StrTargetSubID tag57StrTargetSubID;
        private Tag143StrTargetLocationID tag143StrTargetLocationID;
        private Tag116StrOnBehalfOfSubID tag116StrOnBehalfOfSubID;
        private Tag144StrOnBehalfOfLocationID tag144StrOnBehalfOfLocationID;
        private Tag129StrDeliverToSubID tag129StrDeliverToSubID;
        private Tag145StrDeliverToLocationID tag145StrDeliverToLocationID;
        private Tag43EnuPossDupFlag tag43EnuPossDupFlag;
        private Tag97EnuPossResend tag97EnuPossResend;
        private Tag52UtcSendingTime tag52UtcSendingTime;
        private Tag122UtcOrigSendingTime tag122UtcOrigSendingTime;
        private Tag212LenXmlDataLen tag212LenXmlDataLen;
        private Tag213DatXmlData tag213DatXmlData;
        private Tag347StrMessageEncoding tag347StrMessageEncoding;
        private Tag369SeqLastMsgSeqNumProcessed tag369SeqLastMsgSeqNumProcessed;
        private Tag370UtcOnBehalfOfSendingTime tag370UtcOnBehalfOfSendingTime;

        // tag8 is always required. MAIN
        public BuildHeader( Tag8EnuBeginString parameter ) {
            this.tag8EnuBeginString = parameter;
        }
        // tag9 is required
        public BuildHeader bodyLength( Tag9LenBodyLength parameter ) {
            this.tag9LenBodyLength = parameter;
            return this;
        }
        // tag35 is required
        public BuildHeader msgType( Tag35EnuMsgType parameter ) {
            this.tag35EnuMsgType = parameter;
            return this;
        }
        // tag49 is required
        public BuildHeader senderCompID( Tag49StrSenderCompID parameter ) {
            this.tag49StrSenderCompID = parameter;
            return this;
        }
        // tag56 is required
        public BuildHeader targetCompID( Tag56StrTargetCompID parameter ) {
            this.tag56StrTargetCompID = parameter;
            return this;
        }
        // tag115 is OPTIONAL
        public BuildHeader onBehalfOfCompID( Tag115StrOnBehalfOfCompID parameter ) {
            this.tag115StrOnBehalfOfCompID = parameter;
            return this;
        }
        // tag128 is OPTIONAL
        public BuildHeader deliverToCompID( Tag128StrDeliverToCompID parameter ) {
            this.tag128StrDeliverToCompID = parameter;
            return this;
        }
        // tag90 is OPTIONAL
        public BuildHeader secureDataLen( Tag90LenSecureDataLen parameter ) {
            this.tag90LenSecureDataLen = parameter;
            return this;
        }
        // tag91 is OPTIONAL
        public BuildHeader secureData( Tag91DatSecureData parameter ) {
            this.tag91DatSecureData = parameter;
            return this;
        }
        // tag34 is required
        public BuildHeader msgSeqNum( Tag34SeqMsgSeqNum parameter ) {
            this.tag34SeqMsgSeqNum = parameter;
            return this;
        }
        // tag50 is OPTIONAL
        public BuildHeader senderSubID( Tag50StrSenderSubID parameter ) {
            this.tag50StrSenderSubID = parameter;
            return this;
        }
        // tag142 is OPTIONAL
        public BuildHeader senderLocationID( Tag142StrSenderLocationID parameter ) {
            this.tag142StrSenderLocationID = parameter;
            return this;
        }
        // tag57 is OPTIONAL
        public BuildHeader targetSubID( Tag57StrTargetSubID parameter ) {
            this.tag57StrTargetSubID = parameter;
            return this;
        }
        // tag143 is OPTIONAL
        public BuildHeader targetLocationID( Tag143StrTargetLocationID parameter ) {
            this.tag143StrTargetLocationID = parameter;
            return this;
        }
        // tag116 is OPTIONAL
        public BuildHeader onBehalfOfSubID( Tag116StrOnBehalfOfSubID parameter ) {
            this.tag116StrOnBehalfOfSubID = parameter;
            return this;
        }
        // tag144 is OPTIONAL
        public BuildHeader onBehalfOfLocationID( Tag144StrOnBehalfOfLocationID parameter ) {
            this.tag144StrOnBehalfOfLocationID = parameter;
            return this;
        }
        // tag129 is OPTIONAL
        public BuildHeader deliverToSubID( Tag129StrDeliverToSubID parameter ) {
            this.tag129StrDeliverToSubID = parameter;
            return this;
        }
        // tag145 is OPTIONAL
        public BuildHeader deliverToLocationID( Tag145StrDeliverToLocationID parameter ) {
            this.tag145StrDeliverToLocationID = parameter;
            return this;
        }
        // tag43 is OPTIONAL
        public BuildHeader possDupFlag( Tag43EnuPossDupFlag parameter ) {
            this.tag43EnuPossDupFlag = parameter;
            return this;
        }
        // tag97 is OPTIONAL
        public BuildHeader possResend( Tag97EnuPossResend parameter ) {
            this.tag97EnuPossResend = parameter;
            return this;
        }
        // tag52 is required
        public BuildHeader sendingTime( Tag52UtcSendingTime parameter ) {
            this.tag52UtcSendingTime = parameter;
            return this;
        }
        // tag122 is OPTIONAL
        public BuildHeader origSendingTime( Tag122UtcOrigSendingTime parameter ) {
            this.tag122UtcOrigSendingTime = parameter;
            return this;
        }
        // tag212 is OPTIONAL
        public BuildHeader xmlDataLen( Tag212LenXmlDataLen parameter ) {
            this.tag212LenXmlDataLen = parameter;
            return this;
        }
        // tag213 is OPTIONAL
        public BuildHeader xmlData( Tag213DatXmlData parameter ) {
            this.tag213DatXmlData = parameter;
            return this;
        }
        // tag347 is OPTIONAL
        public BuildHeader messageEncoding( Tag347StrMessageEncoding parameter ) {
            this.tag347StrMessageEncoding = parameter;
            return this;
        }
        // tag369 is OPTIONAL
        public BuildHeader lastMsgSeqNumProcessed( Tag369SeqLastMsgSeqNumProcessed parameter ) {
            this.tag369SeqLastMsgSeqNumProcessed = parameter;
            return this;
        }
        // tag347 is OPTIONAL
        public BuildHeader onBehalfOfSendingTime( Tag370UtcOnBehalfOfSendingTime parameter ) {
            this.tag370UtcOnBehalfOfSendingTime = parameter;
            return this;
        }
        // build puts it all together
        public StandardMessageHeader build() {
            return new StandardMessageHeader( this );
        }
    }
    //
    public static void main( String[] args ) {
        System.out.println("");
        Tag8EnuBeginString tag8EnuBeginString
                = new Tag8EnuBeginString( Enum8BeginString.BEGIN_STRING_4_2 );
        Tag9LenBodyLength tag9LenBodyLength
                = new Tag9LenBodyLength( new MyLengthType( Tag9LenBodyLength.TESTA_LEN_BODY_LENGTH ) );
        Tag35EnuMsgType tag35EnuMsgType
                = new Tag35EnuMsgType( MyEnumMsgType.LOGON );
        Tag49StrSenderCompID tag49StrSenderCompID
                = new Tag49StrSenderCompID( new MyStringType( Tag49StrSenderCompID.TESTA_STR_SENDER_COMP_ID ) );
        Tag56StrTargetCompID tag56StrTargetCompID
                = new Tag56StrTargetCompID( new MyStringType( Tag56StrTargetCompID.TESTA_STR_TARGET_COMP_ID ) );
        Tag115StrOnBehalfOfCompID tag115StrOnBehalfOfCompID
                = new Tag115StrOnBehalfOfCompID( new MyStringType( Tag115StrOnBehalfOfCompID.TESTA_STR_ON_BEHALF_OF_COMP_ID ) );
        Tag128StrDeliverToCompID tag128StrDeliverToCompID
                = new Tag128StrDeliverToCompID( new MyStringType( Tag128StrDeliverToCompID.TESTA_STR_DELIVER_TO_COMP_ID ) );
        Tag90LenSecureDataLen tag90LenSecureDataLen
                = new Tag90LenSecureDataLen( new MyLengthType( Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN ) );
        Tag91DatSecureData tag91DatSecureData
                = new Tag91DatSecureData( new MyDataType( Tag91DatSecureData.TESTA_DAT_SECURE_DATA ) );
        Tag34SeqMsgSeqNum tag34SeqMsgSeqNum
                = new Tag34SeqMsgSeqNum( new MySeqNumType( Tag34SeqMsgSeqNum.TESTA_SEQ_MSG_SEQ_NO ) );
        Tag50StrSenderSubID tag50StrSenderSubID
                = new Tag50StrSenderSubID( new MyStringType( Tag50StrSenderSubID.TESTA_STR_SENDER_SUB_ID ) );
        Tag142StrSenderLocationID tag142StrSenderLocationID
                = new Tag142StrSenderLocationID( new MyStringType( Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID ) );
        Tag57StrTargetSubID tag57StrTargetSubID
                = new Tag57StrTargetSubID( new MyStringType( Tag57StrTargetSubID.TESTA_STR_TARGET_SUB_ID ) );
        Tag143StrTargetLocationID tag143StrTargetLocationID
                = new Tag143StrTargetLocationID( new MyStringType( Tag143StrTargetLocationID.TESTA_STR_TARGET_LOCATION_ID ) );
        Tag116StrOnBehalfOfSubID tag116StrOnBehalfOfSubID
                = new Tag116StrOnBehalfOfSubID( new MyStringType( Tag116StrOnBehalfOfSubID.TESTA_STR_ON_BEHALF_OF_SUB_ID ) );
        Tag144StrOnBehalfOfLocationID tag144StrOnBehalfOfLocationID
                = new Tag144StrOnBehalfOfLocationID( new MyStringType( Tag144StrOnBehalfOfLocationID.TESTA_STR_ON_BEHALF_OF_LOCATION_ID ) );
        Tag129StrDeliverToSubID tag129StrDeliverToSubID
                = new Tag129StrDeliverToSubID( new MyStringType( Tag129StrDeliverToSubID.TESTA_STR_DELIVER_TO_SUB_ID ) );
        Tag145StrDeliverToLocationID tag145StrDeliverToLocationID
                = new Tag145StrDeliverToLocationID( new MyStringType( Tag145StrDeliverToLocationID.TESTA_STR_DELIVER_TO_LOCATION_ID ) );
        Tag43EnuPossDupFlag tag43EnuPossDupFlag
                = new Tag43EnuPossDupFlag( Tag43EnuPossDupFlag.TESTA_ENU_POSS_DUP_FLAG );
        Tag97EnuPossResend tag97EnuPossResend
                = new Tag97EnuPossResend( Tag97EnuPossResend.TESTA_ENU_POSS_RESEND );
        Tag52UtcSendingTime tag52UtcSendingTime
                = new Tag52UtcSendingTime( new MyUTCTimestampType( Tag52UtcSendingTime.TESTA_UTC_SENDING_TIME ) );
        Tag122UtcOrigSendingTime tag122UtcOrigSendingTime
                = new Tag122UtcOrigSendingTime( new MyUTCTimestampType( Tag122UtcOrigSendingTime.TESTA_UTC_ORIG_SENDING_TIME ) );
        Tag212LenXmlDataLen tag212LenXmlDataLen
                = new Tag212LenXmlDataLen( new MyLengthType( Tag212LenXmlDataLen.TESTA_LEN_XML_DATA_LEN ) );
        Tag213DatXmlData tag213DatXmlData
                = new Tag213DatXmlData( new MyDataType( Tag213DatXmlData.TESTA_DAT_XML_DATA ) );
        Tag347StrMessageEncoding tag347StrMessageEncoding
                = new Tag347StrMessageEncoding( new MyStringType( Tag347StrMessageEncoding.TESTA_STR_MESSAGE_ENCODING ) );
        Tag369SeqLastMsgSeqNumProcessed tag369SeqLastMsgSeqNumProcessed
                = new Tag369SeqLastMsgSeqNumProcessed( new MySeqNumType( Tag369SeqLastMsgSeqNumProcessed.TESTA_SEQ_LAST_MSG_SEQ_NUM_PROCESSED ) );
        Tag370UtcOnBehalfOfSendingTime tag370UtcOnBehalfOfSendingTime
                = new Tag370UtcOnBehalfOfSendingTime( new MyUTCTimestampType( Tag370UtcOnBehalfOfSendingTime.TESTA_UTC_ON_BEHALF_OF_SENDING_TIME ) );

        // tag116 is OPTIONAL
        StandardMessageHeader smh =
                new BuildHeader( tag8EnuBeginString )
                        .bodyLength( tag9LenBodyLength )
                        .msgType( tag35EnuMsgType )
                        .senderCompID( tag49StrSenderCompID )
                        .targetCompID( tag56StrTargetCompID )
                        .onBehalfOfCompID( tag115StrOnBehalfOfCompID )
                        .deliverToCompID( tag128StrDeliverToCompID )
                        .secureDataLen( tag90LenSecureDataLen )
                        .secureData( tag91DatSecureData )
                        .msgSeqNum( tag34SeqMsgSeqNum )
                        .senderSubID( tag50StrSenderSubID )
                        .senderLocationID( tag142StrSenderLocationID )
                        .targetSubID( tag57StrTargetSubID )
                        .targetLocationID( tag143StrTargetLocationID )
                        .onBehalfOfSubID( tag116StrOnBehalfOfSubID )
                        .onBehalfOfLocationID( tag144StrOnBehalfOfLocationID )
                        .deliverToSubID( tag129StrDeliverToSubID )
                        .deliverToLocationID( tag145StrDeliverToLocationID )
                        .possDupFlag( tag43EnuPossDupFlag )
                        .possResend( tag97EnuPossResend )
                        .sendingTime( tag52UtcSendingTime )
                        .origSendingTime( tag122UtcOrigSendingTime )
                        .xmlDataLen( tag212LenXmlDataLen )
                        .xmlData( tag213DatXmlData )
                        .messageEncoding( tag347StrMessageEncoding )
                        .lastMsgSeqNumProcessed( tag369SeqLastMsgSeqNumProcessed )
                        .onBehalfOfSendingTime( tag370UtcOnBehalfOfSendingTime )
                        .build();
        System.out.println(smh.tag370UtcOnBehalfOfSendingTime.toString());
    }
}