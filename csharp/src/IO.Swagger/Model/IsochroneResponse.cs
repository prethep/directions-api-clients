/* 
 * GraphHopper Directions API
 *
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// IsochroneResponse
    /// </summary>
    [DataContract]
    public partial class IsochroneResponse :  IEquatable<IsochroneResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IsochroneResponse" /> class.
        /// </summary>
        /// <param name="Polygons">Polygons.</param>
        /// <param name="Copyrights">Copyrights.</param>
        public IsochroneResponse(List<IsochroneResponsePolygon> Polygons = default(List<IsochroneResponsePolygon>), List<string> Copyrights = default(List<string>))
        {
            this.Polygons = Polygons;
            this.Copyrights = Copyrights;
        }
        
        /// <summary>
        /// Gets or Sets Polygons
        /// </summary>
        [DataMember(Name="polygons", EmitDefaultValue=false)]
        public List<IsochroneResponsePolygon> Polygons { get; set; }

        /// <summary>
        /// Gets or Sets Copyrights
        /// </summary>
        [DataMember(Name="copyrights", EmitDefaultValue=false)]
        public List<string> Copyrights { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IsochroneResponse {\n");
            sb.Append("  Polygons: ").Append(Polygons).Append("\n");
            sb.Append("  Copyrights: ").Append(Copyrights).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as IsochroneResponse);
        }

        /// <summary>
        /// Returns true if IsochroneResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of IsochroneResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IsochroneResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Polygons == input.Polygons ||
                    this.Polygons != null &&
                    this.Polygons.SequenceEqual(input.Polygons)
                ) && 
                (
                    this.Copyrights == input.Copyrights ||
                    this.Copyrights != null &&
                    this.Copyrights.SequenceEqual(input.Copyrights)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Polygons != null)
                    hashCode = hashCode * 59 + this.Polygons.GetHashCode();
                if (this.Copyrights != null)
                    hashCode = hashCode * 59 + this.Copyrights.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
