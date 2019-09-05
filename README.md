# EAL Audit Documentation  
### 1 Overview & Objectives  
The EAL must evolve to address the complexities of T-Mobile's IT and network landscape and better support ITSM and Cloud Native SLDLC process execution and decision making.
The EAL evolution and refactoring will be performed as part of the development of the Common Service Asset Map (CSAM).  CSAM is the official name for the implementation of an Enterprise wide CMDB for T-Mobile.  The underlying data model/taxonomy for the CSAM is based on the ServiceNOW Common Service Data Model (CSDM).  The legacy EAL will be consumed within one part of the overall CSAM structure (i.e. as Business Applications).  
[click on this link](#4-eal-audit-steps)
### 2 EAL Audit Instructions 
This EAL Audit is being performed to help complete and cleanse the EAL prior to migration to the new CSAM taxonomy.  The Audit is comprised of 5 steps.  At each step, Application Owners/SMEs are asked to provide, validate or update multiple attributes and/or relationships.  Steps are:

Step 1: Asset Identification  
Step 2: Asset Roles and Groups  
Step 3: Asset Hierarchy  
Step 4: Business Architecture  
Step 5: Environments  

### 3 CSAM Asset Taxonomy (Core Cls)
#### 3.1 Business Application  
A logical representation of all software and/or date store instances (Deployable Instance) and infrastructure used to provide one or more Business Capabilities.  
##### 3.1.1 Level 1 Business Applications (Asset Groups)  
L1 Business Applications are the top level in the Business Application Hierarchy and is used to logically group a set of assets that are "part-of" the L1 Bus App (i.e. Asset Group)

###### *3.1.1.1 Platform*  
A Platform represents the top level logical collection (i.e. Asset Group) of Business Applications that together deliver a cohesive and/or related set of business functionality.  
##### 3.1.2 Level 2 Business Applications (Assests)
L2 Business Application is the logical representationThere are 3 types of L2 Business Applications:
###### *3.1.2.1 Application*  
An Application is a fully-functional integrated IT product that provides functionality to end users and/or to other Applications. Applications do NOT represent physically deployable units, however, can be considered a logical grouping of one or more deployable units.  
###### *3.1.2.2 Data Store*  
A Data Store is a repository for persistently storing and managing collections of data which include not just repositories like databases, but also simpler store types such as simple files, emails etc.  
###### *3.1.2.3 External Systems*  
An External System represents a logical black-box system and/or service(s) that is outside the walls of T-Mobile and is wholly provided and maintained by a third party vendor.  
##### 3.1.3 Level 3 Business Applications (Deployable Units)  
A Deployable Unit is a non-versioned logical grouping of business functionality and/or data that is packaged/built together and represents a separately deployable part of an application. An application can have 1 or more deployable units.  
&nbsp; 
In the CSDM, Deployable Units are captured as the lowest level of the Business Application hierarchy (i.e. Level 3).  There are 3 types of Deployable Units:  
###### *3.1.3.1 Application Component*  
An Application Component implements the business logic of an Application and represents the lowest level track able and separately deployable part of the Application.  
###### *3.1.3.2 Microservice*  
A Microservice is the deployable component of an architectural style that structures an application as a collection of services (i.e. Microservice) that are: Highly maintainable and testable, Loosely coupled, Independently deployable, organized around business capabilities, and owned by a small team.  
###### *3.1.3.3 API*  
An API (Application Programming Interface) is a software intermediary that allows two applications to talk to each other. Essentially, an API is the messenger that delivers a request to the provider and then delivers the response back.  There are different types of APIs such as REST or SOAP.  
#### 3.2 Business Capabilities  
A Business Capability is a particular ability or capacity that a business may possess or exchange to achieve a specific goal or outcome.  

Business Capabilities are at the core of the Business Architecture and defines “What” the business does or needs to do.  
  
Business Capabilities are enabled/realized by a combination of People, Processes, Technology and Information/Data.  
#### 3.3 Application Service  
Application Service is used to represent a Versioned instance of a Deployable Unit (i.e. a Deployable Instance).  The Application Service/Deployable Instance represent a specific install of software that is deployed/installed on a uniquely identifiable infrastructure component (Compute Node).  
#### 3.4 Portfolio  
A Portfolio is a collection of services, products, projects, applications or other portfolios.  Portfolios are used to group other CIs together based some common characteristic or concept.  
##### 3.4.1 Channel
A Channel provides a medium for customers and T-Mobile to interact to conduct Sales and/or Service activities.  Channels include:  

Care &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&nbsp; The channel in which existing customers can call to get support for their T-Mobile account; this includes all  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&nbsp;Care functions including General, Business and Financial Care.  

Retail &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; The channel in which new or existing customers can visit a Retail Store location to purchase or service their  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;&emsp;account.  A physical store location that is owned and operated by T-Mobile. 

Telesales &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; The channel in which a new or existing customer can call to make hardgoods purchase or activate new  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;&emsp; services.  

Web &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;The channel in which a user can self-service for hardgoods purchases, activate new service, account  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp; &emsp;maintenance or get support for problems or questions.  
  
Mobile Device App &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;The channel in which a customer can use their mobile device for self-service account changes or get support  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;for problems and/or questions.
  
IVR &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;&emsp;&emsp; &emsp; An interactive system that allows customers to self-services functions such as payments, payment  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;arrangements, usage details. 

Branded Retail (TPR/TPRi*) &emsp;&emsp;&emsp;&emsp;  T-Mobile Premium Retail - A franchised T-Mobile branded retail location that exclusively sells T-Mobile  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp; &emsp; &emsp;&emsp;&emsp; &emsp;&emsp;&emsp;products & services with the same look and feel as a T-Mobile owned store (Uses T-Mobile systems).  
  
Indirect Dealer &emsp;&emsp;&emsp;&emsp;&emsp;&emsp; &emsp; &emsp; &emsp; Supports Exclusive Prepaid Program (EPP), Exclusive Dealer Program (EDP) and Prepaid Only Dealers.  
  
National Retailers &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; Sales channel, which supports T-Mobile’s “big box” customers, for example, Wal-Mart, SAM’s Club, Target,  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp; &emsp;and Costco.  
  
Partner Brands &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; A Sales channel that sells/supports non T-Mobile branded products and services (e.g. Walmart Family   
&emsp; &emsp; &emsp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;Mobile, GoSmart, or Univision)  
  
TfB Direct (B2B) &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;A channel that supports customer directly contacting T-Mobile for sales and support for the following  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;business account types: Small Business, Mid-Market, Enterprise, Public, Business IL/Affinity, & Wholesale.  
  
TfB Indirect (B2B) &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;A channel that supports indirect dealers with various sales and support functions for the follow TFB  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;customers: Small Business, Mid-Market, Enterprise, Public, Business IL/Affinity & Wholesale.  
  
TfB M2M (B2B) &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;Communication between a Machine-to-Machine (M2M) under IoT  
  
TfB VAR (B2B)  &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp; Value Added Reseller for TfB - Business that adds its own "value," or application to an existing product, and  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;&emsp;then resells the combined product as a package.  
  
Wholesaler &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; Takes care of wireless, IoT, and wireline products and services under direct and indirect channels.  
  
Payment Kiosk &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;A self-service computing terminal or free-standing pavilion in retail environments where customers can  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;&emsp;access information and complete transactions  
  
PayNearMe &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; 3rd party payment vendor  
  
SMS &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;Short messaging services - that are used to communicate, provide account inquiry and provide support to  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;&emsp;existing T-Mobile customers.  
  
Multimedia (TV, Radio, Print) &emsp;&emsp;&emsp;Using more than one medium of expression for marketing and advertising communication to  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;new or existing customers 
  
Social &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; The channel that enable users to interact with new or existing customers via various social media platforms  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;(e.g. Facebook, Twitter).  
  
Partner &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;A partner that provides customer support for T-Mobile services (e.g. YA)  
  
Messaging/Chat &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;A channel that provides instant messaging/chat interactions between TMUS and prospective or existing  
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;customers to perform an action or fulfill a request, such as making a purchase, activating service or getting 
&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;&emsp;&emsp;for a problem or question.  
  
##### 3.4.2 Technology  
A Technology represents a logical 3rd party application or product that is “used” as a foundational building block to develop, build and/or run business applications (L2).   Technologies are built upon or configured to form a new business application.  Technologies are usually licensed packaged software products.  Some common Technologies include: 
  
- Apigee  
- Artifactory  
- AWS
- Azure
- Bitbucket
- Cassandra
- Hadoop
- Jenkins
- Kafka
- Kubernetes
- MongoDB
- Oracle DB Technology
- PCF
- Splunk
- Tibco CE  
  
### 4 EAL Audit Steps 
This EAL Audit is being performed to help complete and cleanse the EAL prior to migration to the new CSAM taxonomy.  The Audit is comprised of 5 steps.  At each step, Application Owners/SMEs are asked to provide, validate or update multiple attributes and/or relationships.  Steps are:  

Step 1: Asset Identification
Step 2: Asset Roles and Groups
Step 3: Asset Hierarchy
Step 4: Business Architecture
Step 5: Environmen ts 

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




  




