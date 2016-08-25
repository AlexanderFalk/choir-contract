/**
 * Toolbox contract for Choir System
 * <p>Logical Data Model</p>
 * 
 * <img src="ldm.png"/>
 *
 * <p>Use case diagram</p>
 * <img src="ucd.png"/>
 * 
 * <p>Subsystem sequence diagram for Edit Member</p>
 * <img src="ssd.png"/>
 * 
* @startuml ldm.png
 * abstract class Person  {
 *   firstName
 *   lastName
 *   dayOfBirth
 *   }
 * class Member {
 *   phone
 *   email
 *   }
 * class Artist {
 *   dayOfDeath[0..1]
 *   wiki: Url
 *   }
 * class Voice {
 *   name
 *   }
 * class Music {
 *   title
 *   opus
 *   }
 * class Material {
 *   title
 *   file
 *   }
 * class Audio {
 *   playingTime
 *   }
 * class Sheet {
 *   pageCount 
 *   }
 * class Repertoire {
 *   name
 *   description
 *   }
 * Person <|-- Member
 * Person <|-- Artist
 * Member "*" -- "1" Voice
 * Music "*" -- "1" Artist : composer
 * Music "*" -- "0..1" Artist : poet
 * Music "*" -- "*" Repertoire
 * Material <|-- Audio
 * Material <|-- Sheet
 * Material "*" -- "1" Music
 * Material "*" -- "1..*" Voice
 * hide circle
 * @enduml
 * 
 * @startuml ucd.png
 * (Find Material for Member) as (UC1)
 * (Print birthday list) as (UC2)
 * (List music in repertoire) as (UC3)
 * (Edit Member) as (UC4)
 * (CRUD Material) as (UC5)
 * (Login) as (UC6)
 * actor Member
 * actor Administrator
 * Member --> (UC1)
 * Member --> (UC2)
 * Member --> (UC3)
 * Member --> (UC4)
 * Member --> (UC6)
 * (UC4) <-- Administrator
 * (UC5) <-- Administrator
 * (UC6) <-- Administrator
 * @enduml
 * 
 * @startuml ssd.png
 * hide footbox
 * actor Member
 * Member -> FE : Choose list of members
 * FE -> BE : listMembers()
 * BE --> FE : Collection<MemberSummary>
 * FE --> Member : Show list of members
 * Member -> FE : Choose member to edit
 * FE -> BE : findMember(id: MemberIdentifier)
 * BE --> FE : MemberDetail
 * FE --> Member : Show member details
 * Member -> FE : Choose edit
 * FE --> Member : Show member details for editing
 * Member -> FE : Commit changes
 * FE -> BE : saveMember(member: MemberDetail)
 * FE --> Member : Show confirmation
 * @enduml
 */
package dk.cphbusiness.choir.contract;
