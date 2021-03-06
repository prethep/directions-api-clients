//
// Request.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class Request: JSONEncodable {
    /** An array of vehicles that can be employed */
    public var vehicles: [Vehicle]?
    /** An array of vehicle types */
    public var vehicleTypes: [VehicleType]?
    /** An array of services */
    public var services: [Service]?
    /** An array of shipments */
    public var shipments: [Shipment]?
    /** An array of relations */
    public var relations: [Relation]?
    /** An array of objectives */
    public var objectives: [Objective]?
    /** An array of cost matrices */
    public var costMatrices: [CostMatrix]?
    public var configuration: Configuration?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["vehicles"] = self.vehicles?.encodeToJSON()
        nillableDictionary["vehicle_types"] = self.vehicleTypes?.encodeToJSON()
        nillableDictionary["services"] = self.services?.encodeToJSON()
        nillableDictionary["shipments"] = self.shipments?.encodeToJSON()
        nillableDictionary["relations"] = self.relations?.encodeToJSON()
        nillableDictionary["objectives"] = self.objectives?.encodeToJSON()
        nillableDictionary["cost_matrices"] = self.costMatrices?.encodeToJSON()
        nillableDictionary["configuration"] = self.configuration?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
