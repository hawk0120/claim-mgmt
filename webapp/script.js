const claims = [];

function createClaim() {
    const description = document.getElementById('description').value;
    const newClaim = {
        id: claims.length + 1,
        description,
        resolved: false,
    };
    claims.push(newClaim);
    alert(`Claim created successfully. ID: ${newClaim.id}`);
    clearInputFields();
}

function resolveClaim() {
    const claimId = parseInt(document.getElementById('claimId').value);
    const claim = findClaimById(claimId);
    if (claim && !claim.resolved) {
        claim.resolved = true;
        alert(`Claim with ID ${claimId} resolved successfully.`);
    } else {
        alert('Claim not found or already resolved.');
    }
    clearInputFields();
}

function viewAllClaims() {
    const claimList = document.getElementById('claimList');
    claimList.innerHTML = '';

    if (claims.length === 0) {
        alert('No claims found.');
    } else {
        claims.forEach(claim => {
            const listItem = document.createElement('li');
            listItem.textContent = `ID: ${claim.id}, Description: ${claim.description}, Resolved: ${claim.resolved ? 'Yes' : 'No'}`;
            claimList.appendChild(listItem);
        });
    }
    clearInputFields();
}

function findClaimById(id) {
    return claims.find(claim => claim.id === id);
}

function clearInputFields() {
    document.getElementById('description').value = '';
    document.getElementById('claimId').value = '';
}
