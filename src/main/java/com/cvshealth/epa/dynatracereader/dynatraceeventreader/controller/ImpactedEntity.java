package com.cvshealth.epa.dynatracereader.dynatraceeventreader.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ImpactedEntity {
    String entityID;
    String entityName;
    String eventType;
    String impactLevel;
}
