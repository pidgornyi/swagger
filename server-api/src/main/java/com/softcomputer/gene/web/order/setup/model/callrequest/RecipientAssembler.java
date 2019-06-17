package com.softcomputer.gene.web.order.setup.model.callrequest;

import org.apache.commons.lang.StringUtils;
import java.util.ArrayList;

public class RecipientAssembler {

    public Recipient assemble(
            RecipientType type, String code, String name, String phone, String phoneExt,
            String phone2, String phone2Ext, String fax, String faxExt,
            String pager, String pagerExt, String callInstructions) {

        Recipient recipient = new Recipient();
        recipient.code = code;
        recipient.name = name;

        recipient.type = type;
        recipient.instructions = callInstructions;
        tryAddContact(recipient, phone, phoneExt, ContactMethod.PRIMARY_PHONE);
        tryAddContact(recipient, phone2, phone2Ext, ContactMethod.ALTERNATIVE_PHONE);
        tryAddContact(recipient, fax, faxExt, ContactMethod.FAX);
        tryAddContact(recipient, pager, pagerExt, ContactMethod.PAGER);
        return recipient;
    }

    private void tryAddContact(Recipient recipient, String num, String ext, ContactMethod method) {
        if (StringUtils.isNotEmpty(num) || StringUtils.isNotEmpty(ext)) {
            if (null == recipient.contacts) {
                recipient.contacts = new ArrayList<Contact>();
            }
            Contact contact = new Contact();
            contact.contactMethod = method;
            contact.phoneNumber = num;
            contact.phoneExt = ext;
            recipient.contacts.add(contact);
        }
    }
}
