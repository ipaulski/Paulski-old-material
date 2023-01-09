using System;
using System.Collections.Generic;

namespace SearchGenerator.Data
{
    public partial class Sp001certifiedTankInspectorsList
    {
        public string Last { get; set; } = null!;
        public string First { get; set; } = null!;
        public string Id { get; set; } = null!;
        public string? Company { get; set; }
        public string? Address { get; set; }
        public string? City { get; set; }
        public string? St { get; set; }
        public string? Zip { get; set; }
        public string? Phone { get; set; }
        public string? Fax { get; set; }
        public string? CcEmail { get; set; }
        public string? Email { get; set; }
        public DateTime OriginalCertificationDate { get; set; }
        public DateTime LicenseExpires { get; set; }
    }
}
