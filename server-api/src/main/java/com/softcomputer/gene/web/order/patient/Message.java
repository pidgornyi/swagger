package com.softcomputer.gene.web.order.patient;

import java.util.Map;

public class Message {
    // mandatory, i.e. 'ComponentFaultException'
    public String id;

    // optional, FATAL|ERROR|WARNING
    public String severity;

    // optional, language resource key
    public String key;

    // optional, should override key (external message (probably not localized), i.e. 'CSF not available')
    public String text;

    // optional, for text interpolation, i.e. { faultComponentName: 'CSF'}
    public Map<String, String> params;
}
