package com.cvshealth.epa.dynatracereader.dynatraceeventreader.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Builder
public class ProblemDto {
   String impactedEntities; // not clear
   ImpactedEntity impactedEntity; //  present - > entityID, entityName, eventType, impactLevel
   String pid;  //possibly -> eventId
   String problemDetailsJSON;
   String problemDetailsMarkdown; // present
   String problemId; //present
   String problemImpact;
   String problemSeverity; // possibly -> severity
   String problemTitle; // possibly -> title
   String problemURL; // possibly -> drillDownURl
   String state; // possibly -> monitorState
   String tags; //
}

