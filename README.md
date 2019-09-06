# EAL Audit Documentation Section 4 
### 4 EAL Audit Steps 
This EAL Audit is being performed to help complete and cleanse the EAL prior to migration to the new CSAM taxonomy.  The Audit is comprised of 5 steps.  At each step, Application Owners/SMEs are asked to provide, validate or update multiple attributes and/or relationships.  Steps are:  

Step 1: [Asset Identification](#4.1-assest-identification)  
Step 2: [Asset Roles and Groups](#asset-roles-and-groups)  
Step 3: [Asset Hierarchy](#4.3-asset-hierarchy)  
Step 4: [Business Architecture](#4.4-business-architecture)  
Step 5: [Environments](#4.5-environments)  

#### 4.1 Asset Identification 
Collect and verify all attributes used to identify and describe the Asset.  
##### 4.1.1 Status 
This is an indicator used to manage the lifecycle of an Asset through development, maintenance and retirement.  

PROPOSED: Asset is being proposed, purchased, added to Sandbox, or developed as a POC.  
  
UNDER DEVELOPMENT: Asset is currently being worked on in development with a project code.  
  
ACTIVE:  In Production and being used for daily activities.  
  
DEPRECATED:  In Production, may or may no longer be actively used for daily activities, planned for decommission/retirement, facilitating data lookups.  Further development/enhancements to this asset are limited or restricted.  
  
RETIRED: Asset has been fully decommissioned.  All compliance data has been moved to a Data Warehouse (Migrated) or ShutDown and replaced by another asset.  
  
CANCELLED: Asset is being cancelled because it mayb be a duplicate entry, the project has been cancelled before moving to production, the purchase has been cancelled...  
  
##### 4.1.2 Asset Type 
Type of Asset per Logical Component (LCA) Taxonomy. Assets will depending on the Level of the Asset in the Business Application Hierarchy.  Asset Types include:  

BA Hierarchy Level 1
- Platform

BA Hierarchy Level 2
- Application 
-  Data Store 
-  External System

BA Hierarchy Level 3
- Application Component
- Microservice
- API (Application Program Interface)

##### 4.1.3 Install Type
Is a classification of the type of Hosting applied to the application.  Can be one of the following:
- ON Premise
- Cloud
- Hybrid
- Third Party Hosted

##### 4.1.4 Aliases
Any/all name(s) that an Asset may be known as.  Note: Name aliases may include the Vendor name if appropriate.  This field is used as a search field to locate application records and should be delimited
##### 4.1.5 Description
A complete high level description of the asset's functionality and who the stakeholders of the application are.  This description is put together by Support teams and owners to describe what the Asset does, how it interacts within the Org & what solution it provides to customers.
##### 4.1.6 Impact when down
Detailed description of what is the impact if the asset is unavailable? Who and what does it affect? What business processes, people and systems are impacted?
##### 4.1.7 Vendor
The vendor/supplier who T-Mobile purchases the asset from.  T-Mobile may purchase the same asset from more than one vendor.  In the case of In-House-Assets (IHAP) this field should be set to "T-Mobile".
##### 4.1.8 Business Criticality
Business Criticality assignment in support of DR and incident impact related to an application and assigned after LCA review. See "EAL - Tier Definitions in ServiceNow" document. Business Criticality can be any of the following:  
  
Tier- 0 Foundation Services, think HEART BEAT  
  
Used by applications and other services in other tiers, or are necessary for data center operations staff to operate, manage, monitor, and troubleshoot the data centers issues and the computing infrastructure within them.  
  
Examples include RAN, IP Network, Core Compute, Identity Access, Monitoring/telemetry, bootstrap tools  
  
Tier- 1 Vital Business Services, think CUSTOMER EXPERIENCE & REVENUE  
  
Part of a business process that is Vital to the success of the business. Vital business functions are an important consideration of business continuity management, IT service continuity management and availability management.  
  
Examples include Care, Retail, Customer Self-serve, Billers, Payments, Orders, Products, Inventory  
  
Tier- 2 Critical Business Services, think BACK-OFFICE ENABLERS, EMPLOYEE EXPERIENCE, COMPLIANCE  
  
include the supporting applications that directly interact and support the delivery of Tier-1 Services  
  
Examples include Supply Chain, Finance, BI/Reporting, HR, eGRC, Legal, critical dev/ops/support tools.  
  
Tier- 3 Standard Business Services, think EVERYTHING ELSE  
  
Production services that do not meet the criticality to the business of Tiers 0 through 2 and are not essential to the daily operation of T-Mobiles core business.  
  
#### 4.2 Asset Roles and Groups  
Collect attributes related to different roles and groups associated with the lifecycle management of the Asset.  
##### 4.2.1 Owned By 
Primary contact (Application Support Contact/ Product Manager/ Business Contact if there is no IT support) for this Asset within T-Mobile in regards to Asset Support (first line of contact when there are any issues). Individual person, not a team name.  This individual should be part of the approval group.  
This contact is responsible for maintaining the data in the EAL (Enterprise Asset List).  Will be contacted for approvals for decommission requests, server build requests ...  
##### 4.2.2 SOX Database Attester 
Individual assigned by the IT Application Owner that will attest to databases viability as in scope for the Quarterly SOX Master Database List Audit  
##### 4.2.3 SOX Service Attester 
Individual assigned by the IT Application Owner that will attest to servers viability as in scope for the Quarterly SOX Master Server List Audit  
##### 4.2.4 Test Resource Coordinator  
The individual accountable for identifying where support teams for the application are needing to be involved in testing for changes which may potentially have a large negative impact to the business.  
##### 4.2.5 PIER Assignment Group(s)
List all PIER assignment groups associated with the EAL Record (Asset).  These are the groups used to support the ticketing workflow.  
##### 4.2.6 Default PIER Assignment Group 
The Default Group corresponds to the first group that gets assigned when a ticket is written against the Application/Asset. 
In CSDM, will be captured as an Active Directory Group that will be providing support for ticketing for the Business Application with which this group is associated. (Pier Assignment Group).  
The queue that is used in the Support Ticket System to assign tickets for helpdesk/ITSM. (Official Pier Assignment Group name, this name is planned to be used to auto generate tickets.).  
##### 4.2.7 PIER Assignment Group Disposition 
For each of the PIER assignment groups listed above: 
- indicate which groups, if any, are not longer used (i.e. Retired).
- indicate which groups, if any, have a corresponding Active Directory group (and provide the name of the AD group).
#### 4.3 Asset Hierarchy
##### 4.3.1 Associated L1 Platform (Asset Group)
This field only applies if Asset is an L2 Business Application (i.e. Application, Datastore or External System). NOTE: Not all L2 BAs will have L1 Platform parent.
##### 4.3.2 Associated L2 Business App (Asset)
This field only applies if Asset is an L3 Business Application/Deployable Unit (i.e App Component, Microservice, or API).   NOTE: ALL L3 BusApps must have an L2 Parent.  
##### 4.3.3 Associated L3 Business App (Deployable Units)
This field only applies if Asset is an L2 Business Application (i.e. Application, Datastore or External System)  
##### 4.3.4 Dependent Technology  
Identify all the 3rd Party Technology Products that are used to develop, deploy, or run this Business App/Asset.  
#### 4.4 Business Architecture 
##### 4.4.1 Associated L3 Business Capabilities 
Validate and Update the list of L3 Business Capabilities that this Business Application supports, enables or automates.  
##### 4.4.2 Associated Channel(s)
Identify all the Sales/Support Channels that are supported by the Business Application.
#### 4.5 Environments 
##### 4.5.1 Business Application Enviroment(s)
Identify all Environment(s) where this Bus App is deployed.  Include Environment Names and associated Type.
Environment Types:
- Production
- Adminstrative
- Development
- DIT
- PLAB
- QAT
- Sandbox
- Staging
- Temporary
- Testing (Other)
- Training
- UAT
- Replication HUB




  




