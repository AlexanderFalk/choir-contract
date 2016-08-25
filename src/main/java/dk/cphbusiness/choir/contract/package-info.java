/**
 * Toolbox contract for Choir System
 * <p>
 * Example of use:
 * <p>
 * <img src="contract.png">
 *
 * @startuml contract.png
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
 * Person <|-- Member
 * Person <|-- Artist
 * Member "*" -- "1" Voice
 * Music "*" -- "1" Artist : composer
 * Music "*" -- "0..1" Artist : poet
 * Material <|-- Audio
 * Material <|-- Sheet
 * Material "*" -- "1" Music
 * Material "*" -- "1..*" Voice
 * hide circle
 * @enduml
 */
package dk.cphbusiness.choir.contract;
